package com.test.java;

public class Ex04_DataType {
	public static void main(String[] args) {
		
		// 8������ �ڷ��� 
		// -> ���� + ������ + ���
		
		// ������
		
		byte b1;
		b1 = 100;
		System.out.println("byte: " + b1);
		
		byte b2;
		b2 = 127; // ��Ů������ �ǽð����� javac.exe�� �����ؼ� ������ �����Ѵ�.
		System.out.println("byte: " + b2);
		
		byte b3;
		b3 = Byte.MAX_VALUE;
		System.out.println("byte: " + b3);
		
		byte b4;
		b4 = Byte.MIN_VALUE;
		System.out.println("byte: " + b4);
		
		short s1;
		s1 = 128;
		System.out.println("short: " +s1);
		
		s1 = 32000;
		System.out.println("short: " +s1);
		
		int n1;
		n1 = 100;
		System.out.println("int: " + n1);
		
		n1 = 2000000000;
		System.out.println("int: " + n1 );
		
		long l1;
		l1 = 100;
		System.out.println("long: " + l1);
		System.out.println("long: " + l1);
		
		
		//�ڷ��� ������ = ���(������);
		byte num1 = 10;
		short num2 =10;
		int num3 = 10;
		long num4 = 10;
		
		
		
		
		//�Ǽ��� 
		// - �Ǽ��� ����� double�� ����Ѵ�.
		
		//��������
		float f1;
		f1 =3.14F;
		System.out.println("float: " + f1);
		
		//��������
		double d1;
		d1 = 5.31;
		System.out.println("double: " + d1);
		
		
		f1 = 1.2345678901234567890123456789F;
		d1 = 1.2345678901234567890123456789D;
	    
		System.out.println("float: " + f1);
		System.out.println("double: " + d1);
		
		
		//������ 
		// - char
		// - 2byte -> �����ڵ�(Unicode)
		
		char c1;
		c1 = 'A'; // ������ ���(������ ���ͷ�) ->'����' : ������ ��� ǥ���
	    System.out.println(c1);
	    
	    c1 = 'B';
	    System.out.println(c1);
	    
	    c1 = '��';
	    System.out.println(c1);
	    
	    c1 = '&';
	    System.out.println(c1);
	    
	    //c1 = 'AB';
	    //System.out.println(c1);
		
		//���� 
		// - boolean(bool)
	    boolean flag;
	    
	    flag = true; //1
	    System.out.println(flag);
	    
	    flag = false; //0
	    System.out.println(flag);
	    
	    //����
	    // - ����(����): byte(1), short(2), int(4), long(8)
	    // - ����(�Ǽ�): float(4), double(8)
	    // - ����: char(2);
	    // - ��: boolean(1)
		
	    //���ڿ�
	    // -�ڷ��� �� �ϳ�
	    // -�� ��(X), ������(O)
	    // -������ ����
	    // -String
	    
	    //�л� ����
	    // -�̸� ���� -> ȫ�浿
	    char name1 = 'ȫ';
	    char name2 = '��';
	    char name3 = '��';
	    
	    System.out.print(name1);
	    System.out.print(name2);
	    System.out.println(name3);
	    
	    System.out.println("" + name1 + name2 + name3);
	    
	    //���ڿ�
	    // -ȫ�浿 -> 'ȫ' + '��' + '��'
	    //�ڹٿ��� String�� �ִ� ���̴� 2147483647
	    
	    String name;
	    name = "ȫ�浿"; //���ڿ� ���(���ڿ� ���ͷ�) -> "���ڿ�" : ���ڿ� ���ͷ� ǥ���
	    
	    System.out.println(name);
	    
	    String str;
	    
	    str = ""; //���ڿ�, Empty String - ���α׷��󿡼� �ʿ信 ���� �ʱ�ȭ�ϴ� �뵵�� �� ���
	    System.out.println(str);
	    
	    //9���� �ڷ���
	    
	    int m1= 10;
	    System.out.println(m1);
	    
	    int m2 = 20; // ������ �����ϰ� �� ���� -> NULL ����, NULL���� ������. -> �ƹ��͵� ����
	    System.out.println(m2);
	    
	    /* ****�ڹٿ����� (����)������ �ʱ�ȭ���� ���� ���¿����� ���(����, ��� ��)�� �� ����
	    int m3;
	    System.out.println(m3); //The local variable m3 may not have been initialized */
	    
	    
	    
	    
	}

}
