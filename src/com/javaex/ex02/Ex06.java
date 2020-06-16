package com.javaex.ex02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int time, pay;

		
		System.out.print("근무시간: ");
		time = sc.nextInt();
		if(time<=8)
		{
			pay = 1000*10*time;
		}
		else
		{
			pay = 1000*15*time;
		}
		
		System.out.println("임금은 " + pay + "원 입니다.");

	}

}
