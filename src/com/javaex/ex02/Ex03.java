package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		//스캐너 준비
		//변수 선언
		//출력문 출력
		//키보드에서 이름 나이 키를 입력받는다
		//이름 나이 키 출력
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		double height;
		
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		name = sc.nextLine();
		
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		age = sc.nextInt();
		
		System.out.println("키를 입력해주세요");
		System.out.print("키:");
		height = sc.nextDouble();
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 키는 " + height + " 입니다.");
		
		
		
		sc.close();
	}

}
