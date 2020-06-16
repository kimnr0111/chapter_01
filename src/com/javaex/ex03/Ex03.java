package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dan;
		int i;
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		dan = sc.nextInt();
		
		for(i=1;i<=9;i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		
		sc.close();

	}

}
