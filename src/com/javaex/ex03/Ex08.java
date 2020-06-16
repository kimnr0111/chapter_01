package com.javaex.ex03;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		
		/*
		for(i=1;i<=6;i++) {
			for(j=5;i<=j;j--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		*/
		/*
		for(i=1;i<=5;i++) {
			for(j=5;i<=j;j--) {
				System.out.print("*");
			}
			for(k=1;k<=j;k++) {
				System.out.print("@");
			}
			
			System.out.println("");
			
		}
		*/
		
		/*
		for(i=1;i<=5;i++) {
			for(j=5;i<j;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		*/
		
		
		for(i=1;i<=5;i++) {
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(k=10;i*2<=k;k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
