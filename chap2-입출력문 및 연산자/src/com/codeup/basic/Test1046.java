package com.codeup.basic;

import java.util.Scanner;

public class Test1046 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a + b + c;
		double avg = (double)sum / 3;
		
		System.out.println(sum);
		System.out.printf("%.1f",avg);
		
		

	}

}
