package com.test.java;

public class Ex05_Escape {
	public static void main(String[] args) {
		
		//Ex05_Escape.java 
		
		//Ư�� ���� > Escape Sequence
		/* -�����Ϸ����� �̸� ��ӵ� Ư�� ǥ���� �����ϸ� -> ���� ��(���� ��) �� ��ӵ� Ư¡�� �ش��ϴ� �ൿ�� �ϱ�� �̸� ����� ���� */
		
		//1. \n
        // -new line
		// -���� ����(����)
		// - \n ������ ���͸� �Ķ�
		
		char c1 = '\n';
		
		String s1 = "�ȳ��ϼ���.\nȫ�浿�Դϴ�.";
		System.out.println(s1);
		
		//2. \r
		// - carriage return
		// - ĳ���� ��ġ�� ���� ������ ù��° ���� �̵��ض� -> Home Ű�� ������
		
		s1= "�ȳ��ϼ���.\r�ƹ���";
		System.out.println(s1);
		
		//\r + \n
		//Ÿ�ڱ�
		
		//�ü�� or ����ȯ��
		// -����
		// 1. \r\n
		// 2. \r
		// 3. \n
		
		//3. \t
		// - tab
		// - �ǹ���
		// - ���� ���ϱ�? 4ĭ, 8ĭ ����...
		// -���Ŀ�
        
		s1 = "ȫ�浿\t�Դϴ�.";
		System.out.println(s1);
		
		//4. \b
		// - backspace
		s1 = "ȫ��\b���Դϴ�.";
		System.out.println(s1);
		
		//5. \", \', \\
		
		//ȭ�� ��� > ȫ�浿: "�ȳ��ϼ���."
		
		s1 = "ȫ�浿: \"�ȳ��ϼ���.\""; // escape
		System.out.println(s1);
		
		//���� ��������  ������ ��θ� ����Ͻÿ�.
		//D:\class\java
		
		s1 = "D:\\class\\java";
		System.out.println(s1);
		
		
	
	
	
	}

}
