package com.test.java;

public class Ex19_Operator {
	
	public static void main(String[] args) {
		
		//1. ��� ������
		//2. �� ������
		
		//3. �� ������ 
		// - &&, ||, !
		
		/*
		  ���� ǥ��
		  ~(tild), !, @, #, $, %, ^(carret, xor), &, *, -, . ? ' , "
		  
		  '(quote), `(back quote)
		  
		 (), [], {}, <>
		 
		 A > B
		 A greater than B
		 A >= B
		 A Greater than equal B
		 
		 A < B
		 A less than B
		 
		 */
		
		//3. �� ������
		// - &&(and), ||(or), !(not), ^(xor, exclusive or, ��Ÿ�� ����)
		// - �ǿ����ڸ� ������� Ư�� ��Ģ�� ���� ������ ����� ��ȯ �Ѵ�.
		// - &&, || : 2�� ������ 
		// - ! : 1�� ������ 
		// - �ǿ����� �ڷ����� boolean�� ������.
		// - ������ ����� boolean�� ��ȯ�Ѵ�.
		// - �� �����ڸ� �ַ� �� �����ڿ� �Բ� ����Ѵ�.
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		
		//�䱸����] ���̸� �Է� -> 19�� �̻� ~ 60�� �̸�
		int age = 25;
		
		//System.out.println(19 <= age < 60); (Error)
		//                    (true < 60)
		
		System.out.println("19 <= age: "+ (19 <= age));
		System.out.println("age < 60: "+(age < 60));
		
		//������ �켱 ����
		//�� ������ > �� ������
		System.out.println(19 <= age && age < 60);
		
		
		//���� 1�� �Է� -> ���� �ҹ���?
		char c1 ='d';
		
		System.out.println("c1 >= 'a' && c1 < 'z': " +(c1 >= 'a' && c1 < 'z'));
		
		System.out.println();
		
		age = 25;
		String address = "����";
		String gender = "����";
		
		//����] ���̰� 20�� �̻��̰� �ּҰ� �����ΰ�?
		System.out.println(age >= 20 && address.equals("����"));
		
		//����] ���̰� 20�� �̻��̰ų� Ȥ�� �ּһ� �����ΰ�?
		System.out.println(age >= 20 || address.equals("����"));
		
		//����]  ���̰� 20�� �̻��̰� �ּҰ� �����̸� ������ �����ΰ�?
		System.out.println(age >= 20 && address.equals("����") && gender.equals("����"));
		//����]  ���̰� 20�� �̻��̰� �ּҰ� �����̰ų� Ȥ�� ������ �����ΰ�?
		System.out.println(age >= 20 && address.equals("����") || gender.equals("����"));
		//����]  ���̰� 20�� �̻��̰ų� Ȥ�� �ּҰ� �����̸� ������ �����ΰ�?
		System.out.println(age >= 20 || address.equals("����") && gender.equals("����"));
		//����]  ���̰� 20�� �̻� �Ǵ� �ּҰ� ����ų� Ȥ�� ������ �����ΰ�?
		System.out.println(age >= 20 || address.equals("����") || gender.equals("����"));
		
		//��(���� ������)
		// - !(not)
		// -1�� ������ 
		
		b1= true;
		
		System.out.println("!b1: "+ !b1);
		
		b2 = false;
		
		System.out.println("!b2: "+ !b2);
		
		age =25;
		
		System.out.println();
		
		System.out.println(age >= 19 && age < 60); // true
		
		System.out.println(!(age < 19 || age >= 60)); // �𸣰ڴ� 
		
		
		//4. ����(�Ҵ�) ������
		// - = 
	    // - +=, -=, *=, /=, %= : ���� ���� ������
		
		System.out.println();
		System.out.println();
		
		int n = 10;
		
		//����(*********)
		n = n + 1;
		
		//1~3���� ��
		n = 1 + 2 + 3 ;
		
		//1~3���� �� 
		n = 0;
		n = n + 1;
		n = n + 2;
		n = n + 3;
		
		System.out.println(n);
		
		n += 5;
		System.out.println(n);
		
		int m =10;
		
		n= n +m ;
	
		System.out.println(n);
		
		n+= m;
		System.out.println(n);
		
		n = n -3;
		System.out.println(n);
		
		n -= 3;
		System.out.println(n);
		
		n = n *2 ;
		System.out.println(n);
		
		n *= 2;
		System.out.println(n);
		
		n = n/2;
		System.out.println(n);
		
		n /= 2;
		System.out.println(n);
		
		n = n % 8;
		System.out.println(n);
		
		n %=8;
		System.out.println(n);
		
		//������ �켱 ����
		// -(�Ұ�ȣ) > ��� > �� > �� > ���� 
		
		//5. ���� ������ 
		// - ++, -- 
		// 1�� ������
		// �ǿ����ڴ� ���ڸ� ������
		// �ǿ������� ���� +1, -1 ���� ��Ų��
		//---------------------------------------------------------
	    
		System.out.println();
		System.out.println();
		
		n =10;
		int Sum =0;
		
		Sum = 20 + ++n;
		
		
		System.out.println("++n: "+Sum);
		
		n =10;
		Sum =0;
		
		Sum = 20 + n++;
		System.out.println("n++: "+Sum);
		System.out.println(n);
		
		//���� �����ڴ� ��ġ/��ġ�� ���� �켱 ������ �ٲ�� ������ ����ϱ� ���鰡.( ������ ����)-> �״ϱ� ������� ���� !!
		
		// �ϳ��� ����ȿ� ���� �����ڿ� �ٸ� �����ڸ� ���� �ٸ� �����ڿ� �ٸ� �����ڸ� ���� ���� ����!!
		
		int o = 10;
		System.out.println(--o - o--);
		
		//6. ���� ������ 
		// - ?:
		// - 3�� ������
		// - A ? B : C
		// - A : boolean
		// - B, C : ���, ����, ���� -> ��
		// - B�� C�� �ڷ����� �����ؾ� �Ѵ�.
		
		
		int result1 = true ? 10 : 20;
		
		System.out.println(result1);
		
		age = 15; 
		// 19�� �̻� ~ 60�� �̸� : ���
		
	    System.out.println(age >= 19 && age < 60);
	    
	    String result2 = (age >= 19 && age < 60) ? "���" : "����";
	    System.out.println(result2);
	    
	    System.out.printf("�Է��Ͻ� ���� %d���� ȸ�� ���� %s�Դϴ�.", age, result2);

		
		
		
	}

}
