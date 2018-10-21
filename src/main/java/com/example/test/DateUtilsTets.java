package com.example.test;

import java.text.SimpleDateFormat;
import java.sql.Date;

/**
 * 根据年龄获取出生日期
 * test测试类
 * @author Administrator
 *
 */


public class DateUtilsTets {

	public static void main(String[] args) throws Exception {
		
		Date date = new DateUtilsTets().currentDate(10);
		
		System.out.println(date);
	}

	
	public Date  currentDate(int year)  throws Exception{
        //获取今天的时间
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat  dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String  date1 = dateFormat.format(date);
        String [] time= date1.split("-");
        int currentYear = Integer.valueOf(time[0]);
        int month = Integer.valueOf(time[1]);
        int day = Integer.valueOf(time[2]);
        if(currentYear  % 4 == 0 && currentYear % 100 !=0 || currentYear % 400 == 0){
                     day--;
        }
        String  birthYear =  Integer.toString(currentYear - year);
        String  birthMonth = Integer.toString(month);
        String  birthDay = Integer.toString(day);
        String  birth = birthYear + "-" + birthMonth + "-" + birthDay;
         dateFormat.parse(birth);
         Date date2 = new Date(dateFormat.parse(birth).getTime());
        return  date2;
        
  
    }
	
	
}
