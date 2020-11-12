package com.wzs.test.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
/**
 * 
 * @ClassName: ProxyFactory
 * @Description: ������
 * @author wzs
 * @date 2017��11��12��
 *
 */
public class ProxyFactory {  
	  
    public static <T> T create(Class<T> c, String ip, int port) {  
         InvocationHandler handler = new RpcProxy(ip, port, c);  
          
        return (T) Proxy.newProxyInstance(c.getClassLoader(),  
                new Class[] {c },  
                handler);  
    }  
}  
