package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17_Operator {
	
	public static void main(String[] args) throws IOException {
		
		
		//������
		//1. ��� ������ 
		// - +, -, *, /, %
		// - ������ ����� �� �ǿ����� �� �� ū �ڷ������� ��ȯ�ȴ� (*****)
		// - ���� ��Ȳ�� ��Ʈ�� ���� ���ϸ� -> �����÷ο찡( ����÷ο�)�� �߻��Ѵ�.
		
		
		//2. �� ������ 
		// - >, >=, <, <=, ==, !=
		// - 2�� ������ 
		// - �ǿ����ڵ��� �� ������ ��ȯ�ϴ� ���� 
		// - �ǿ����ڴ� ���ڸ� ������.
		// - ������ ����� �׻� boolean���� ��ȯ�Ѵ�.
		
		int a = 10;
		int b = 3;
		
		System.out.println(a > b); //t
		System.out.println(a >= b);//t
		System.out.println(a < b);//f
		System.out.println(a <= b);//f
		System.out.println(a == b);//f
		System.out.println(a != b);//t
		
		//���� �Է� 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.println("����: ");
		
		//String data =br.readLine();
		
		//System.out.println("ȫ�浿" > "�ƹ���"); (X)
		
		//int age = Integer.parseInt(data);
		
		//System.out.println(age >= 19); // ���� �ڵ� 
		//System.out.println( 19 <= age); //���� �ڵ� (�ǵ��� ������� �� ��)
		
		//-----------------------------------------------------------------------
		
		//��ȿ�� �˻�, validation Check
		// -(����� �Է�) �����Ͱ� ���α׷��󿡼� ���� �ִ� ������ �ƴ����� �Ǵ��ϴ� �۾�
		
		// ����� �Է� ���� -> �ҹ��� �Է� Ȯ��
		
		//������ <-> ����(X)
		//String <-> int
		//System.out.println((int)data);
		
		
		System.out.print("����: ");
		
		int code = br.read();
		System.out.println(code);
		
		System.out.println(code >= 97);
		System.out.println(code <= 122);
	    
	    System.out.println(code >= (int)'a');
	    System.out.println(code <= (int)'z');
	    
	    System.out.println(code >= 'a');
	    System.out.println(code <= 'z');
	    
	    System.out.println('a'>'b');
	    
	    System.out.println("�ѱ� �˻�");
	    System.out.println(code >= '��');
	    System.out.println(code <= '�R');
	    
	    System.out.println("���� �˻�");
	    System.out.println(code >= '0');
	    System.out.println(code <= '9');
	    
	    //******************
	    System.out.println('ȫ'>'��');//O - �� �����ڿ��� char�� ������� �Ѵ�-> ���������� �� ������ ����
	   // System.out.println("ȫ">"��");//X - ������ ������ �񱳿����� �Ұ���
		
	    
	    
		
		
		
		
		
		
	}

}
