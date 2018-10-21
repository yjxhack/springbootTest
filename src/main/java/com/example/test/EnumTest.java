package com.example.test;

import com.example.enume.ColorEnum;

public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println(ColorEnum.getEnumByKey("red"));
		System.out.println(ColorEnum.BLUE.getKey());
		System.out.println(ColorEnum.BLUE.getValue());
	}
	
}
