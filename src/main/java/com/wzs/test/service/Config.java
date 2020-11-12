package com.wzs.test.service;

import java.util.HashMap;
import java.util.Map;

import com.wzs.test.HelloImpl;

/**
 *  
 * @ClassName: ConfMonitor
 * @Description: 管理注册类映射
 * @author wzs
 * @date 2017年11月12日
 *
 */
public class Config {  
    public static Map<String, Class> conf = new HashMap<String, Class>();  
      
    static {  
        conf.put("com.wzs.test.IHello", HelloImpl.class);  
    }  
}  