package com.javaex.ex01;

public class Ex06 {
	
	public static void main(String[] args) {
		
		/*
		float var01 = 12.5F;
		int var02 = (int)var01;
		
		int var00 = (int)12.5;
		
		System.out.println(var02);
		
		System.out.println(var00);
		
		byte bValue = 10;
		
		int iValue = bValue;
		
		System.out.println(iValue);
		*/
		
		int iValue = 5050;
		
		byte bValue = (byte)iValue;
		
		System.out.println(bValue);
		
		double dValue = 5.11;
		
		int result = (int)dValue;
		
		System.out.println(result);
		
		int iValue2 = 123;
		
		double result2 = (double)iValue2;
		
		System.out.println(result2);

		
		//자동형변환 int + float
		float result3 = 2 + 2.5F;
		
		System.out.println(result3);
		
		
		//자동형변환 long + float
		long var02 = 12345L;
		float var03 = 1.1F;
		float result01 = var02 + var03;
		
		System.out.println(result01);
		
		
		/*강제형변환*/
		double d = 1112.999999;
		int i;
		i = (int)d;
		
		System.out.println(i);
		
		
		/*확대변환*/
		byte v01 = 10;
		int v02 = (int)v01;
		System.out.println(v02);
		
		/*축소변환*/
		//정상변환
		int v03 = 10;
		byte v04 = (byte)v03;
		System.out.println(v04);
		//비정상변환         제대로 변환 안됨
		int v05 = 5002435;
		byte v06 = (byte)v05;
		System.out.println(v06);
		
		//실수-->정수
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수-->실수
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		
		
	}

}
