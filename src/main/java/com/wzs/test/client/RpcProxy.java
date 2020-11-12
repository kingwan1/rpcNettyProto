package com.wzs.test.client;

import static org.jboss.netty.channel.Channels.pipeline;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;
import org.jboss.netty.handler.codec.serialization.ClassResolvers;
import org.jboss.netty.handler.codec.serialization.ObjectDecoder;
import org.jboss.netty.handler.codec.serialization.ObjectEncoder;

import com.wzs.test.service.RpcObject;
/**
 * 
 * @ClassName: RpcProxy
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author wzs
 * @date 2017年11月12日
 *
 */
public class RpcProxy extends SimpleChannelUpstreamHandler implements InvocationHandler, Serializable{  
    private String ip;  
    private int port;  
    private Class c;  
    private Object obj; 
    Channel channel; 
    private static final long serialVersionUID = 1L;  
  
    public RpcProxy(String ip, int port, Class c) {  
        this.ip = ip;  
        this.port = port;  
        this.c = c;  
    }  
      
    
    /** 
     * 动态代理类，当调用接口方法的时候转为调用此方法 
     */  
    public Object invoke(Object proxy, Method method, Object[] args)  
            throws Throwable {  
        RpcObject.request_Net.Builder builder = RpcObject.request_Net.newBuilder();
        for (int i = 0; i < args.length; i++) {
        	builder.setArgs(i, RpcObject.Params.newBuilder().setKey(args[i].toString()).setValue(args[i].getClass().toString()).build());
        }
        builder.setCla(this.c.getName());
        builder.setMethodName(method.getName());
        
        		//new RpcObject(c, method.getName(), args); 
        ExecutorService s1 = Executors.newCachedThreadPool();
        ExecutorService s2 = Executors.newCachedThreadPool();
        ClientBootstrap bootstrap = new ClientBootstrap(  
                new NioClientSocketChannelFactory(  
                        s1,  
                        s2));  
          
        bootstrap.setPipelineFactory(new ChannelPipelineFactory(){  
            public ChannelPipeline getPipeline() throws Exception {  
                ChannelPipeline pipleline = pipeline();  
                pipleline.addLast("encode", new ObjectEncoder());  
                pipleline.addLast("decode", new ObjectDecoder(ClassResolvers.cacheDisabled(null)));  
				pipleline.addLast("handler", RpcProxy.this);  
                return pipleline;  
            }  
        });  
          
        /* 
         * 与127.0.0.1建立长连接。  
         */  
       ChannelFuture future = bootstrap.connect(new InetSocketAddress(ip, port));
        future.getChannel().write(builder.build());
        future.sync();
        future.getChannel();
        
        this.channel = future.getChannel();
        synchronized (this.channel) {
			try {
				this.channel.wait();
			} catch (InterruptedException e) {
			}
		}
        this.channel.close().awaitUninterruptibly();
        bootstrap.shutdown();
        s1.shutdown();
        s2.shutdown();
        return this.obj;
    }  
    
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)  
            throws Exception  
    {  
		this.obj = (Object) e.getMessage();
		synchronized (this.channel) {
			this.channel.notifyAll();
		}
    }  
  
    public void exceptionCaught(  
            ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {  
        System.err.println("Client has a error,Error cause:"+e.getCause());  
        e.getChannel().close();  
    }
      
}  