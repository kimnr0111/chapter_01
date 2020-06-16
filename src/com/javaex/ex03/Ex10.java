package com.javaex.ex03;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		/*
		for(i=1;i<=20;i++) {
			if(i%2 != 0 && i%3 != 0) {
				System.out.println(i);
			}
		}
		*/
		
		for(i=1;i<=20;i++) {
			if(i%2 == 0 || i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
