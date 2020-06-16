package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = new int[3];
		
		for (int i = 0;i<3;i++) {
			arrB[i] = arrA[i];
		}
		
		System.out.println("arrA[]");
		for(int i = 0;i<arrA.length;i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("==========");
		System.out.println("arrB[]");
		for(int i = 0;i<arrB.length;i++) {
			System.out.println(arrB[i]);
		}
		System.out.println("==================");
		System.out.println("==================");
		
		arrA[1] = 10;
		
		System.out.println("arrA[]");
		for(int i = 0;i<arrA.length;i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("==========");
		System.out.println("arrB[]");
		for(int i = 0;i<arrB.length;i++) {
			System.out.println(arrB[i]);
		}

	}

}
