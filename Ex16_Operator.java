package com.test.java;

public class Ex16_Operator {
	
	public static void main(String[] args) {
		
		//������, Operator
		// - �ǿ����� (Operand)�� ������� �̸� ������ ����(���, �ൿ)�� �� �Ŀ� ������� ��ȯ�ϴ� ���
		// - �ַ� ��ȣ�� ����ؼ� ǥ�� 
		
		//1. ����(Statement)
		//2. ǥ����(Expression)
		//3. ������ 
		//4. �ǿ�����
		//5. ������ �켱����
		//6. ���� ���� 
		
		//�������� ����
		//1. ��� ������ 
		//- +, -, *, /, % (������, mod)
		//- 2�� ������
		//- �ǿ����ڸ� ���ڷ� ������. (����, �Ǽ�)
		
		//1 + 2 * 3 + 4
		//
		
		
		int a = 10;
		int b =3;
		
		System.out.println(a + b);// 13
		System.out.println(a - b);// 7
		System.out.println(a * b);// 30
		System.out.println(a / b);// 3
		System.out.println(a % b);// 1
		System.out.println();
		
		//������ ������ 
		// -����/���� = ����
		// -�Ǽ�/���� = �Ǽ�
		// -����/�Ǽ� = �Ǽ�
		// -�Ǽ�/�Ǽ� = �Ǽ�
		
		// ***** ��� ��� ������ ��� �ڷ����� �� �ǿ������� �ڷ��� �� �� ū �ڷ������� ��ȯ�ȴ�.
		
		System.out.println(10 / 3);
		System.out.println(10.0 / 3);
		System.out.println(10 / 3.0);
		System.out.println(10.0 / 3.0);
		
		int n1 = 2000000000;//20��
		int n2 = 2000000000;
		int n3;
		
		n3 = n1 + n2;
		
		System.out.println("n3: " +	n3);
		
		//int + int = int
		//long + int = long
		System.out.println(2000000000L + 2000000000);
		
		
		
	    	
		
		
	    
		
		
		
		
		
		
		
		
		
	}

}
