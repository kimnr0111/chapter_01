package com.javaex.ex02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c_code;
		String c_room;
		
		System.out.print("과목을 선택하세요\n(1.자바 2.C 3.C++ 4.파이썬)\n과목번호: ");
		c_code = sc.nextInt();
		
		if(c_code == 1) {
			c_room = "R101호";
		} else if(c_code == 2) {
			c_room = "R202호";
		} else if(c_code == 3) {
			c_room = "R303호";
		} else if(c_code == 4) {
			c_room = "R404호";
		} else {
			c_room = "상담원에게 문의하세요";
		}
		
		System.out.println(c_room);
	}

}
