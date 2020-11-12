package com.wzs.test.service;

import static org.jboss.netty.channel.Channels.pipeline;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.handler.codec.serialization.ClassResolvers;
import org.jboss.netty.handler.codec.serialization.ObjectDecoder;
import org.jboss.netty.handler.codec.serialization.ObjectEncoder;
/**
 * 
 * @ClassName: Server
 * @Description: 服务端管理
 * @author wzs
 * @date 2017年11月12日
 *
 */
public class Server {  
    public static final int port = 9001;  
      
    public static void main(String[] args) {  
            exportRpc();  
    }  
      
    /** 
     * 导出RPC接口 
     */  
    private static void exportRpc() {
    	ServerBootstrap server = null;
			server = new ServerBootstrap(
					new NioServerSocketChannelFactory(Executors.newCachedThreadPool(),  
			               Executors.newCachedThreadPool()));
			server.setPipelineFactory(new ChannelPipelineFactory() {
				
				public ChannelPipeline getPipeline() throws Exception {
					// TODO Auto-generated method stub
					ChannelPipeline pip = pipeline();
					pip.addLast("encode", new ObjectEncoder());
					pip.addLast("decode", new ObjectDecoder(ClassResolvers.cacheDisabled(null)));
					pip.addLast("handler", new ServerHandler());
					return pip;
				}
			});
			server.bind(new InetSocketAddress("127.0.0.1",port));
	
    }  
}  


