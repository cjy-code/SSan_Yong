package com.test.java;

import java.io.IOException;

public class Ex10_Input {
	
	public static void main(String[] args) throws IOException {
		
		//1.
		System.out.println("���ڸ� �Է��ϼ���.");
		
		//2.
		int data = System.in.read();
		
		//5.
		// -���� ���� %c�� ���ڸ� �����ϸ� �ش� ����
		System.out.printf("�Է��� ���ڴ� '%d'�Դϴ�.\n", data);
		System.out.printf("�Է��� ���ڴ� '%c'�Դϴ�.\n", data);
	}

}
