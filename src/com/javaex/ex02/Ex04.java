package com.javaex.ex02;

import java.util.Scanner;



public class Ex04 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//println사용으로 점수: 출력
		//scanner 선언으로 입력받을 수 있도록
		//int 정수형 score 선언
		//sc.nextInt 로 정수값 입력받음
		//if 조건문 사용으로 score 가 60점 이상일 경우 합격입니다. 
		//60점 이하일 경우 불합격입니다. 출력
		
		Scanner sc = new Scanner(System.in);
		double score;

		
		while(true)
		{
			System.out.print("점수: ");
			score = sc.nextDouble();
				if(score>100 || score<0)
				{
					System.out.println("잘못된 값을 입력하였습니다. 0 - 100 사이의 값을 입력해주세요");
				}
				else
				{
					break;
				}
			}

		if(score>=60)
		{
			System.out.println("합격입니다.");
		}
		else
		{
			System.out.println("불합격입니다.");
		}

	}

}