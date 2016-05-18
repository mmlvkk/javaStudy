package com.mmlvkk.classTest;

public class SuperClass {
	public static  int i = 5;
	public static  String helloWorld = "hello world";
	static {
		System.out.println("super static block  print");
		i=6;
	}
	
	

}
