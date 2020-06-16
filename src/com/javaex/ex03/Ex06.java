package com.javaex.ex03;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		
		for(i=2;i<=9;i++) {
			for(j=1 ;j<=9;j++) {
				System.out.println(i + "*" + j + "=" + i*j);
				if(j == 9) {
					System.out.println("");
				}
			}
		}

	}

}
