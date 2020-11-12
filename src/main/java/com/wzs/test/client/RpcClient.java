package com.wzs.test.client;

import com.wzs.test.IHello;
/**
 * 
 * @ClassName: RpcClient
 * @Description: �ͻ��˲��ԣ�ͨ���ӿڴ�����ȡԶ��ʵ���࣬�������󷵻�
 * @author wzs
 * @date 2017��11��12��
 *
 */
public class RpcClient {  
    public static void main(String[] args) {  
        String ip = "127.0.0.1";  
        int port = 9001;  
        	IHello hello = ProxyFactory.create(IHello.class, ip, port);  
        	System.out.println(hello.sayHello("wzj"));  
    }  
}  