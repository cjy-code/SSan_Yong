package com.test.java;

public class Ex22_Mathod {
	
	public static void main(String[] args) {
		
		//�޼ҵ� ���� ����Ʈ
		
		//�޼ҵ� ���� ����Ʈ
		// - �Ķ����
		// - ���� (Argument)
		// - �Ű�����
		// - ������/������, Form parameter/ Real parameter
		
		//��Ի���] 'ȫ�浿'���� �λ��ϴ� �޼��带 �ۼ��Ͻÿ�.
		
		hello();
		
		//�������] '�ƹ���'���� �λ��ϴ� �޼��带 �ۼ��Ͻÿ�.
		
		hello2();
		
		//�������] �츮��(31��) ��� ���ڿ��� �λ��ϴ� �޼��带 �ۼ��Ͻÿ�.
		//-> �޼��� 31�� ������ ��.
		
		//�������] �츮���� �����ο��� �λ��ϴ� �޼��带 �ۼ��Ͻÿ�.
		//-> �޼��� 5,164���� ������ ��.
		
		hi("ȫ�⸮����������");
		
		int a = 10;
		
		m1(a);
		m1(10);
		
		String b = "ȫ�浿";
		//�Ű������� �ڷ����� ���ڰ��� �ڷ����� �ݵ�� �����ؾ� �Ѵ�.
		//m1(b);
		
		short c =10;
		m1(c);
		
		double d = 10;
		m1((int)d);
		
		
		//***** �޼��尡 �Ű������� �����ϸ� �ݵ�� ���ڰ��� �����ϸ鼭 ȣ���ؾ� �Ѵ�. -> �޼��� ȣ�� �Ұ���
		
		//m1();
		
		m2("ȫ�浿", 20);
		
		m3(10,20);
		m3(100, 250);
		m3(1000000000,2000000000);
		
		//********** �޼��带 ����ϴ� �������� �޼��� ���ο��� ����� �Ͼ���� �� �ʿ䰡 ����.
		m4("�Ҿƹ���",70);
		m4("������",10);
		
	}// main
	
	public static void hello() { 
		
		System.out.println("ȫ�浿�� �ȳ��ϼ���.");
		
	}
	
    public static void hello2() { 
		
		System.out.println("�ƹ����� �ȳ��ϼ���.");
		
	}
    
    public static void hi(String name ) { 
    	
    	//String name = "ȫ�浿";
    	System.out.printf("%s�� �ݰ����ϴ�.\n", name);
    	
    }
    
    public static void m1(int num) { 
    	
    	System.out.println("num: " + num);
    	
    }
    
    public static void m2(String name, int age) {
    	System.out.printf("�̸�: %s\n����: %d��", name, age);
    }
    
    public static void m3(int a, int b) {
    	System.out.printf("%,d + %,d = %d\n", a, b, a+b);
    	
    
    }
    
    public static void m4(String name, int age) {
    	//����: �ȳ��ϼ���. ȫ�浿��.
    	//����: �ȳ� ~ �浿�� ~
    	
    	String result = age >= 14? "�ȳ��ϼ���." : "�ȴ�~";
    	System.out.printf("%s %s\n",result,name);
    }

}
