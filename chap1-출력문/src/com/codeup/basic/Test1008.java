package com.codeup.basic;

public class Test1008 {

	public static void main(String[] args) {
		
		// 특수문자 유니코드 검색
		// 1차 표현에러 : 유니코드 위에 줄바꿈 \을 지우니까 해결됨
		System.out.println("\u250C\u252C\u2510");
		System.out.println("\u251C\u253C\u2524");
		System.out.println("\u2514\u2534\u2518");
	}

}
