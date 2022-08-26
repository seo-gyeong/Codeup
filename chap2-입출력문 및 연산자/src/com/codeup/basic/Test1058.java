package com.codeup.basic;

import java.util.Scanner;

public class Test1058 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		byte a = sc.nextByte();
		byte b = sc.nextByte();
		
		if(a == 0 && b == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
