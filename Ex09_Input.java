package com.test.java;

import java.io.IOException;

public class Ex09_Input {
	
	public static void main(String[] args) throws IOException {
		
		
		//�ܼ� �����
		// 1. ���
        //   a.print()
		//   b.println()
		//   c.printf()
		
		//  2. �Է�
		//   a. read(): ������, ���ۿ���
	            //- �Է��� ������ �����ڵ尪�� ��ȯ�ϴ� ����
		        //- �ѹ� ���࿡ 1���ڸ� ��ȯ�Ѵ�.
		        //- ����Ʈ ������ �б� ����(�ѹ��� 1Byte���� �д´�)
		//   b. BufferedReader Ŭ���� : �ǻ��
		//   c. Scanner Ŭ���� : �ǻ��
		
		
		//�䱸����] ����ڷκ��� ���� 1���� �Է¹����ÿ�. ���� ���ڸ� ȭ�鿡 ����Ͻÿ�.
		//�Է�] A 
		//���] A 
		
		System.out.print("�Է�] ");
		
		//����ڷκ��� Ű���带 �Է��� �޽��ϴ�.
		// -������� Ű���� �Է��� ���͸� �ľ� ������.(******)
		int data = System.in.read(); //�Է� ��� ���� -> �� �ɷȴ�.
		
		//A(65) ~Z(90)
		//a(97) ~z(122)
		//0(48) ~9(57)
		
		System.out.println(data);
		
		System.out.println("�����մϴ٤���.");
		
		
	}

}
