package com.test.java;

import java.io.IOException;

public class Ex10_Input {
	
	public static void main(String[] args) throws IOException {
		
		//1.
		System.out.println("문자를 입력하세요.");
		
		//2.
		int data = System.in.read();
		
		//5.
		// -형식 문자 %c는 숫자를 전달하면 해당 숫자
		System.out.printf("입력한 문자는 '%d'입니다.\n", data);
		System.out.printf("입력한 문자는 '%c'입니다.\n", data);
	}

}
