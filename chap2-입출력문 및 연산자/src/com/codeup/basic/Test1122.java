package com.codeup.basic;

import java.util.Scanner;

public class Test1122 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int minute = a / 60;
		int sec = a % 60;
		System.out.println(minute + " " + sec);

	}

}
