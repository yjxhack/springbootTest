/**
 * @projectName springBootTest
 * @package com.example.service
 * @className com.example.service.ThreadMainTest
 * @copyright Copyright 2018 Thuisoft, Inc. All rights reserved.
 */
package com.example.service;

/**
 * ThreadMainTest
 * @description TODO
 * @author Administrator
 * @date 2018年11月1日 下午7:51:27
 * @version TODO
 */
public class ThreadMainTest {
    /**
      线程的测试
     * ThreadMainTest
     * @description TODO
     * @param args
     * @author Administrator
     * @date 2018年11月1日 下午8:09:03
     * @version TODO
     */
    public static void main(String[] args) {
             
        Thread  threadOne=new ThreadTest();
        threadOne.setName("测试线程1");
        Thread   threadTwo = new ThreadTest();
        threadTwo.setName("测试线程2");
        threadOne.start();
        threadTwo.start();
    System.out.println("程序运行结束");
    
      
 
        
        
    }
    
    
    
}
