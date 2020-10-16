package com.test.java;

public class Ex15_Casting {
	
	public static void main(String[] args) {
		
		/*
		  
		  (�ڷ�)����ȯ, (Data)Type Casting
		  -int -> float
		  -double -> byte
		  
		  ����ȯ 
		  - �������� ����. int -> double
		  - ���������� ���� 
		  - ������ ���������� ��ȯ�� �Ұ��� String -> int (X), int -> String(X)
		  
		  �Ͻ����� ����ȯ, �ڵ� Ÿ�� ��ȯ  
		  - ū�� = ������
		  - 100% ����
		  
		  ������� ����ȯ, ���� Ÿ�� ��ȯ 
		  - ������ = ū��
		  - ��쿡 ���� �ٸ� 
		  		  			  
		 */
		
		  //'=' ������
		  // - ���� ������(�Ҵ� ������)
		  // - ���� = ��;
		  // - LValue(����) =RValue(���, ����)
		  //
		  // -******** Lvalue�� �ڷ����� R �� �ڷ����� �ݵ��(100%) ���ƾ� �ȴ� > ���� ������ ������ �߻��Ѵ�.
		
		
	
		  byte b1; // ����
		  short s1; // ���纻
		  
		  b1 = 10;
		  //short = byte
		  //s1 = b1;//���� �߻�
		  
		  // () : ����ȯ ������ 
		  s1 = (short)b1;
		  
		  System.out.println(s1);
		  
		  
		  
		  int n1 = 1000000000; //����(10��)
		  long l1;
		  
		  l1 = (long)n1;
		  
		  System.out.println(l1); //���纻 Ȯ��
		  
		  byte b2;
		  short s2;
		  
		  s2 = 550; // ***** ������� ����ȯ�� �߻��Ҹ� �� ���翡���� ������ ���� ���纻�� �ڷ����� ������ ������� �ݵ�� Ȯ���Ѵ�!!!
		  
		  
		  //byte = short
		  //���� = ū
		  //������� ����ȯ
		  //********** ���� ��������!!!!!!
		  
		  b2 = (byte)s2;
		  
		  System.out.println(b2);
		  
		  //��� ���� ����
		  int money = 2100000000; // 21��
		  
		  //���� ��ü
		  short copy;
		  
		  //��ü 
		  copy = (short)money;// ����� ����ȯ -> �� �۾��� ������ �߻��� ������ �ֱ� ������ ������ �װ�!!! ���ݵ�� ���� ������ ����!!!
		  
		  //���� ��ü Ȯ�� -> �ܾ� ���
		  System.out.println(copy); 
          
		  		  
		  
		  
		  
		 //�Ǽ� < - > �Ǽ�
		 float f1; //����
		 double d1;
		 
		 f1 = 3.14F;
		 
		 //double = float
		 //ū��(8) = ������(4)
		 d1 =(double)f1 ;
		 
		 System.out.println(d1);
		 
		 float f2;
		 double d2;
		 
		 d2 = 3.14;
		 		 
		 f2 =(float) d2;
		 
		 System.out.println(f2);
		 
		 
		 
		 //------------------------------------------------------------------
		 //������ ����� �ڷ����� int�̴�.
		 
		 //byte = int
		 byte m1 = 10;
		 //short = int
		 short m2 = 10;
		 //int = int
		 int m3 = 10;
		 //long = int 
		 long m4 = 10;
		 
		 
		 
		 float m5 =3.14F;
		 
		 double m6 = 3.14;
		 
		  
		 //-----------------------------------------------------
		 
		 // ���� <-> �Ǽ� 
		 
		 int n3; //����
		 double d3;
		 
		 n3 =100;
		 //8����Ʈ = 4����Ʈ
		 //�Ͻ��� ����ȯ 
		 d3 =n3;
		 
		 System.out.println(d3);
		 
		 int n4;
		 double d4; //����
		 
		 d4 = 3.14;
		 
		 //int(4) = double(8)
		 //����� ����ȯ
		 n4 = (int)d4;
		 
		 System.out.println(n4); //******���� !!!
		  
		 
		 
		 //----------------------------------------------------
		 
		 long l5; 
		 float f5;
		 
		 l5 = 100;
		 
		 //4byte = 8byte
		 //����� ����ȯ -> �Ͻ��� ����ȯ
		 f5 =l5;
		  
		 long l6;
		 float f6; //����
		 
		 f6 = 3.14F;
		 
		 //8byte = 4byte
		 //�Ͻ��� ����ȯ -> ����� ����ȯ
		 l6 = (long)f6;
		 
		 //�ڷ��� ũ��
		 //byte(1byte) < short(2byte) < int(4) < long(8) < float(4) < double(8)
		 //                        char(2)
		 
		  
		 // ---------------------------------------------------------------------
		 
		 char c7; //���� 
		 int n7;
		  
		 c7 = 'A';
		 
		 //int = char
		 //4 = 2
		 //ū�� = ������ 
		 n7 = c7;
		 
		 System.out.println("n7: "+n7);
		 n7 = c7;
		  
		 char c8;
		 int n8;
		 
		 n8 = 97;
		 
		 //������ = ū��
		 c8 =(char) n8;
		 
		 System.out.println("n8: "+c8);
		 
		 //-------------------------------------------------------------------------
		 
		 char c9; //2byte
		 short s9;//2byte
		 
		 c9 = '��'; //44035
		 
		 //short : -32768 ~ 32767
		 //char : 0 ~ 65535
		 s9 =(short)c9;
		 
		 System.out.println("s9: "+s9); //�����: -21504
		 
		 // char �� �����ڵ�� ��ȣ ��ȯ�� ���� �ݵ�� int�� ����ؾ� �Ѵ�.         
		 
		 
	}

}
