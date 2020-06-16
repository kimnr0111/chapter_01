package com.javaex.ex02;

import java.util.Scanner;

public class Ex10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int c_code;
		String c_room;
		
		System.out.print("과목을 선택하세요\n(1.자바 2.C 3.C++ 4.파이썬)\n과목번호: ");
		c_code = sc.nextInt();
		
		/*
		switch(c_code) {
		case 1:
			c_room = "R101호";
			break;
		case 2:
			c_room = "R202호";
			break;
		case 3:
			c_room = "R303호";
			break;
		case 4:
			c_room = "R404호";
			break;
		default:
			c_room = "상담원에게 문의하세요";
			break;
		}
		
		System.out.println(c_room);
		*/
		
		switch(c_code) {
		case 1:
			System.out.println("R101호");
			break;
		case 2:
			System.out.println("R202호");
			break;
		case 3:
			System.out.println("R303호");
			break;
		case 4:
			System.out.println("R404호");
			break;
		default:
			System.out.println("상담원에게 문의하세요");
			break;
		}

	}

}
