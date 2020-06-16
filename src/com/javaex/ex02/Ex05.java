package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int Num;
		System.out.print("숫자를 입력하세요\n숫자: ");
		Num = sc.nextInt();
		
		if(Num == 0)
		{
			System.out.println("0입니다.");
		}
		else if(Num >=0)
		{
			System.out.println("양수입니다.");
		}
		else
		{
			System.out.println("음수입니다.");
		}

	}

}
