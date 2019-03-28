package com.example.redis;

/**
 * Created by yangjiaxiong on 2019/3/27/027 14:30
 * redis 常用的key
 */
public class RedisKeys {
    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }

    public static String getShiroSessionKey(String key){
        return "sessionid:" + key;
    }

    public static String getOrderId(){
        return "scms:orderId:";
    }
}
