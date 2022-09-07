package com.codeup.basic;

import java.util.Scanner;

public class Test1123 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cel = sc.nextInt();
		double fah = (double)9 / 5 * cel + 32;
		System.out.format("%.3f",fah);

	}

}
