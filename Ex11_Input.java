package com.test.java;

import java.io.IOException;

public class Ex11_Input {
	
	public static void main(String[] args) throws IOException {
		
		//System.in.read()
		// - �ѹ��� �Ѱ��� ���ڸ� �Է� �޴´�.
		// -read() �޼���� ����ڰ� �Է��� Ű�� �������� �޼���(X)
		// -read() �޼���� �Է� ���۾��� ����ִ� ���ڸ� �������� �޼���(O)
		
		// ����� �����Է� -> �Է� ���ۿ� ���� -> read() �Һ�
		
		System.out.print("�Է�: "); 
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
