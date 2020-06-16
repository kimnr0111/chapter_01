package com.javaex.ex02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int Num;
		
		System.out.print("숫자를 입력하세요\n숫자: ");
		Num = sc.nextInt();
		
		if(Num>0)
		{
			if(Num%2 == 0)
			{
				System.out.println("짝수입니다.");
			}
			else
			{
				System.out.println("홀수입니다.");
			}
		}
		else
		{
			System.out.println("0입니다.");
		}

	}

}
