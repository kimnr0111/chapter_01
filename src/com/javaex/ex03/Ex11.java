package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("숫자를 입력하세요.[0이면 종료]");
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계: " + sum);
			
		} while(num != 0);
		
		System.out.println("종료");
	}

}
