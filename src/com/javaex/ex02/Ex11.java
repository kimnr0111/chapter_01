package com.javaex.ex02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int month;
		String day;
		
		System.out.print("월을 입력하세요: ");
		month = sc.nextInt();

		switch(month) {
		case 2:
			day = "28일";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = "30일";
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = "31일";
			break;
		default:
			day = "1 - 12 사이의 숫자를 입력";
			break;
		}
		System.out.println(day);

	}

}
