package com.javaex.ex02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int score;
		char grade;
		
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		if(score>=90)
		{
			grade = 'A';
		}
		else if(score>=80)
		{
			grade = 'B';
		}
		else if(score>=70)
		{
			grade = 'C';
		}
		else if(score>=60)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}
		System.out.println(grade + "등급");

	}

}
