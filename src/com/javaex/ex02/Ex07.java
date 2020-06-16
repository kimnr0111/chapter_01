package com.javaex.ex02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.println("점수를 입력하세요");
		score = sc.nextInt();
		if(score%3 == 0)
		{
			System.out.println(score + "은(는) 3의 배수 입니다.");
		}
		else
		{
			System.out.println(score + "은(는) 3의 배수가 아닙니다.");
		}
		

	}

}
