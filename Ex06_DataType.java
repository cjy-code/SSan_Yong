package com.test.java;

public class Ex06_DataType {
	
	public static void main(String[] args) {
		
		//���� ���� 2�� + ���ϴ� ��������� ����� ���
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println("a" + "b");
		System.out.println(a + "b");
		System.out.println("a" + b);
		

		System.out.println(a + "+" + b + "="+ a + b);
		
		// ���� ������ �����͸� ����� �� ������ ��!!
		
		// �ֹε�Ϲ�ȣ ����
		// - 9510201012345
		
		//���� -> ����
		//���� -> long
		
		long jumin = 9510201012345L;
		System.out.println("�ֹε�Ϲ�ȣ: " + jumin);
		
		jumin =0310201012345L;
		System.out.println("�ֹε�Ϲ�ȣ: " + jumin);
		
		//�ڹٿ��� ���� ��� ǥ��� (������ ���ؼ�)
		// - ����� ǥ��
		//1. 10����
		//2. 8����
		//3. 16����
		//4. 2����(X)
		
		int num = 10; //�ҽ�(10) -> 10����
		System.out.println(num);
		
		num = 010;
		System.out.println(num);
		
		num =0x10; //�ҽ�(0xXXX)-> 16����
		System.out.println(num);
		
		//��ǰ ��ȣ ����
		// -0001, 0002, 0003, 0004
		
		int no = 0001;
		System.out.println(no); //1
		
		String no2 = "0001";
		System.out.println(no2);
		
		String jumin2 = "031020";
		System.out.println(jumin2);
		
		//*************** ���ڷ� �����Ǿ� �ִ� �������� �ڷ����� ������ �� ����
		//1. ���� : ������ ����� �Ǵ� ���
		//2. ���ڿ� : �� �̿� ������
		
		//��ȭ��ȣ -> ���ڿ�
		//���� -> ���� Ȥ�� ���ڿ�
		
	
		
	}

}
