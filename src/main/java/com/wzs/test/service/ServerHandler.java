package com.wzs.test.service;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.jboss.netty.channel.ChannelHandlerContext;  
import org.jboss.netty.channel.ExceptionEvent;  
import org.jboss.netty.channel.MessageEvent;  
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;  
  
/**
 * 
 * @ClassName: RpcThread
 * @Description: 解析传递参数
 * @author wzs
 * @date 2017年11月12日
 *
 */
public class ServerHandler extends SimpleChannelUpstreamHandler  
{  
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)  
            throws Exception  
    {  
        RpcObject.request_Net rpcObject = (RpcObject.request_Net) e.getMessage();
        Object o = getObject(rpcObject.getCla());
        rpcObject.getArgs(0).getKey();
        rpcObject.getArgs(0).getValue();
        rpcObject.getArgsList();
        
        Object[] args = new Object[];
        Object reO = executeMethod(o, rpcObject.getMethodName(), rpcObject.get);
        e.getChannel().write(reO);
    }  
      
    public void exceptionCaught(  
            ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {  
        System.err.println("Client has a error,Error cause:"+e.getCause());  
        e.getChannel().close();  
    }
    
    /** 
     * 通过反射技术执行方法，并返回返回值 
     * @param o 
     * @param methodName 
     * @param args 
     * @return 
     */  
    private Object executeMethod(Object o, String methodName, Object[] args) {  
        Object objR = null;  
        Class[] cs = new Class[args.length];  
        for (int i = 0; i < args.length; i++) {  
            Object arg = args[i];  
            cs[i] = arg.getClass();  
        }  
        try {  
            Method m = o.getClass().getMethod(methodName, cs);  
            objR = m.invoke(o, args);  
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (NoSuchMethodException e) {  
            e.printStackTrace();  
        } catch (IllegalArgumentException e) {  
            e.printStackTrace();  
        } catch (IllegalAccessException e) {  
            e.printStackTrace();  
        } catch (InvocationTargetException e) {  
            e.printStackTrace();  
        }  
        return objR;  
    }  
      
    /** 
     * 根据接口名得到实例 
     * @param c 
     * @return 
     */  
    private Object getObject(String c) {  
        Object o = null;  
        try {  
        	o = Config.conf.get(c).newInstance();  
        } catch (InstantiationException e) {  
            e.printStackTrace();  
        } catch (IllegalAccessException e) {  
        	e.printStackTrace();  
        }  
        return o;  
    }
}  
