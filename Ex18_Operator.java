package com.test.java;

public class Ex18_Operator {
	
	public static void main(String[] args) {
		
		//�޸� ����(����)
		// 1.stack ����
		// -�����ڰ� ���� ��� ������ �� ������ �����ȴ�.
		
		
		// 2.Heap����
		
		//�� ������ 
		// - ==, !=
		//1. ���� == ���� 
		//2. ���ڿ� == ���ڿ�
		
		int n1 = 100;
		int n2 = 200;
		
		String s1 = "ȫ�浿";
		String s2 = "ȫ�浿";
		String s3 = "�ƹ���";
		
		//������ ������ �񱳴� �ּҰ��� ���Ѵ�.(*********************)
		System.out.println("s1 == s2: "+s1 == s2); //����� ����ϸ� �ȵȴ�.
		System.out.println("s1 == s3: "+s1 == s3); //����� ����ϸ� �ȵȴ�.
		
		String s4 = "ȫ�浿";
		String s5 = "ȫ";
		s5 = s5 + "�浿"; //ȫ�浿
		
		System.out.println("s4: "+s4);
		System.out.println("s5: "+s5);
		
		System.out.println("s4==s5: "+ (s4 == s5));
		
		//���ڿ��� �񱳴� == �����ڸ� ������� �ʰ� equals() �޼��带 ����Ѵ�.( ***********)
		System.out.println(s4.equals(s5)); // true
		
		//������ == ������ : �ּҰ� ��
		//������.eaquals(������) : ��(������) ��
		
		
	}

}
