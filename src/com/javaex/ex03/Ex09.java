package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			i = sc.nextInt();
			if(i == 0) {
				System.out.println("종료");
				break;
			}
			if(i%6 == 0 && i%14 == 0) {
				System.out.println("6과 14의 공배수입니다.");
			} else {
				System.out.println("6과 14의 공배수가 아닙니다.");
			}
		}

	}

}
