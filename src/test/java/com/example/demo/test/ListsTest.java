package com.example.demo.test;

import java.util.List;

import com.google.common.collect.Lists;

public class ListsTest {
	
public static void main(String[] args) {
	
  List<Object> list =	Lists.newArrayList();
  list.add("杨佳雄");
  
  for (Object object : list) {
	System.out.println(object);
}
 
}

}
