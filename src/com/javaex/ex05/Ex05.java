package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args[0].equals("-version")) {
			System.out.println("main_ver2.23");
		}
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}

	}

}
