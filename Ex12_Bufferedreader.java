package com.test.java;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

//*(wildcard) - ��� Ŭ���� -> all
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12_Bufferedreader {
	
	public static void main(String[] args) throws IOException {
		
		//Ex12_BufferedReader.java
		
		//���� 1�� �Է� -> ���
		
		System.out.print("����: ");
		
		//System.in.read() ���� ���� �ڵ�
		//Cntl + Shift + 0 : ��Ű��(Ŭ����) Import ����Ű
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//System.in.read(); �޼���
		//reader.read(); �޼���
		//reader.readLine(); �޼���
		
		
		//A(65) ~ Z(90)
		//a(97) ~ z(122)
		//0(48) ~ 9(47)
		//��(44032) ~�R(55203)
		//�� ~ ��
		//�� ~ ��

        //int data = reader.read();
        //System.out.printf("%c\n",data);
		
		//readLine(): ����� �Է��� ������ �����´�.(�� ������ ��°�� �����´�.)
	    //String data = reader.readLine();
	    //System.out.println(data);
		
		//�䱸����] ����ڿ��� �̸��� �Է¹޾� -> �λ��� ����Ͻÿ�.
		System.out.print("�̸� �Է�: ");
		
		String name = reader.readLine();
		
		System.out.printf("%s�� �ݰ����ϴ�.\n", name);
		
		
		
		
	}

}
