package com.example.enume;



/**
 * 自定义枚举
 * @author Administrator
 *
 */
public enum ColorEnum  {
    RED("red","红色"),GREEN("green","绿色"),BLUE("blue","蓝色");
    //防止字段值被修改，增加的字段也统一final表示常量
    private final String key;
    private final String value;
    
    private ColorEnum(String key,String value){
        this.key = key;
        this.value = value;
    }
    //根据key获取枚举 枚举常用的方法
    public static ColorEnum getEnumByKey(String key){
        if(null == key){
            return null;
        }
        for(ColorEnum temp:ColorEnum.values()){
            if(temp.getKey().equals(key)){
                return temp;
            }
        }
        return null;
    }
    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
}