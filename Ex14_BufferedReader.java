package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14_BufferedReader {
	
	public static void main(String[] args) throws IOException {
		
		
		//����ڿ��� ���� 2���� �Է� -> +���� -> ���� ������ ����� ����Ͻÿ�.
		
		//ù��° ����: 5
		//�ι�° ����: 3
		//���] 5 + 3 =8
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù��° ����: ");
		String data1= br.readLine();
		
		System.out.print("�ι�° ����: ");
		String data2= br.readLine();
		
		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);
		
		int sum = num1 + num2;
		
		System.out.printf("���] %d + %d = %d\n", num1, num2, sum);
	}

}
