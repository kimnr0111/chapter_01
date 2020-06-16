package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 7;
		int b = 2;
		
		/*산술연산자*/
		System.out.println("산술연산자");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(pVar);
		System.out.println(mVar);
		
		//증감연산자
		System.out.println("증감연산자");
		System.out.println(a);		//7
		System.out.println(++a);	//7-->8출력
		System.out.println(b);		//2
		System.out.println(--b);	//2-->1출력
		System.out.println(a++);	//8출력-->9
		

	}

}
