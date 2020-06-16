package com.javaex.ex01;

public class Ex10 {
	
	public static void main(String[] arges) {
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리연산자 &&
		System.out.println("&&연산자");		
		System.out.println(true&&true);		//true
		System.out.println(true&&false);	//false
		System.out.println(false&&true);	//false
		System.out.println(false&&false);	//false
		
		//논리연산자||
		System.out.println("||연산자");
		System.out.println(true||true);		//true
		System.out.println(true||false);	//true
		System.out.println(false||true);	//true
		System.out.println(false||false);	//false
		
		//응용
		System.out.println("응용");
		System.out.println((a>b)&&(a<b));  	//f&&t --> f
		
		System.out.println((a>b)||(a<b));  	//f||t --> t
	}

}
