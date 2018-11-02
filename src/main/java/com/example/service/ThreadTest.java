/**
 * @projectName springBootTest
 * @package com.example.service
 * @className com.example.service.ThreadTest
 * @copyright Copyright 2018 Thuisoft, Inc. All rights reserved.
 */
package com.example.service;

/**
 * ThreadTest
 * @description TODO
 * @author yangjiaxiong 
 * @date 2018年11月1日 下午7:46:38
 * @version TODO
 */
public class ThreadTest extends Thread {

     
    
   
    
    
    /**
     * @see java.lang.Thread#run() 
     */
    @Override
    public void run() {
        
  for (int i = 0; i < 10; i++) {
    System.out.println(Thread.currentThread());
}
  
    }
    
  
    
   
}
