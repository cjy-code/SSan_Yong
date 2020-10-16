package com.test.java;

import java.io.IOException;

public class Ex11_Input {
	
	public static void main(String[] args) throws IOException {
		
		//System.in.read()
		// - 한번에 한개의 문자만 입력 받는다.
		// -read() 메서드는 사용자가 입력한 키를 가져오는 메서드(X)
		// -read() 메서드는 입력 버퍼안의 들어있는 문자를 가져오는 메서드(O)
		
		// 사용자 문자입력 -> 입력 버퍼에 저장 -> read() 소비
		
		System.out.print("입력: "); 
		int data = System.in.read();
		System.out.println(data);
		System.out.println(1);
		
		data = System.in.read();
		System.out.println(data);
		System.out.println(2);
		
		data = System.in.read();
		System.out.println(data);
		System.out.println(4);
		
		data = System.in.read();
		System.out.println(data);
		System.out.println(5);
		
	}

}
