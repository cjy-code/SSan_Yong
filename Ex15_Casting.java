package com.test.java;

public class Ex15_Casting {
	
	public static void main(String[] args) {
		
		/*
		  
		  (자료)형변환, (Data)Type Casting
		  -int -> float
		  -double -> byte
		  
		  형변환 
		  - 값형간의 가능. int -> double
		  - 참조형간의 가능 
		  - 값형과 참조형간의 변환은 불가능 String -> int (X), int -> String(X)
		  
		  암시적인 형변환, 자동 타입 변환  
		  - 큰형 = 작은형
		  - 100% 안전
		  
		  명시적인 형변환, 강제 타입 변환 
		  - 작은형 = 큰형
		  - 경우에 따라 다름 
		  		  			  
		 */
		
		  //'=' 연산자
		  // - 대입 연산자(할당 연산자)
		  // - 변수 = 값;
		  // - LValue(변수) =RValue(상수, 변수)
		  //
		  // -******** Lvalue의 자료형과 R 의 자료형은 반드시(100%) 같아야 된다 > 같지 않은면 에러가 발생한다.
		
		
	
		  byte b1; // 원본
		  short s1; // 복사본
		  
		  b1 = 10;
		  //short = byte
		  //s1 = b1;//에러 발생
		  
		  // () : 형변환 연산자 
		  s1 = (short)b1;
		  
		  System.out.println(s1);
		  
		  
		  
		  int n1 = 1000000000; //원본(10억)
		  long l1;
		  
		  l1 = (long)n1;
		  
		  System.out.println(l1); //복사본 확인
		  
		  byte b2;
		  short s2;
		  
		  s2 = 550; // ***** 명시적인 형변환이 발생할만 한 복사에서는 원본의 값이 복사본의 자료형의 범위를 벗어나는지 반드시 확인한다!!!
		  
		  
		  //byte = short
		  //작은 = 큰
		  //명시적인 형변환
		  //********** 아주 무서운일!!!!!!
		  
		  b2 = (byte)s2;
		  
		  System.out.println(b2);
		  
		  //기업 은행 계좌
		  int money = 2100000000; // 21억
		  
		  //계좌 이체
		  short copy;
		  
		  //이체 
		  copy = (short)money;// 명시적 형변환 -> 이 작업은 문제가 발생할 소지가 있기 때문에 개발자 네가!!! ㅂ반드시 정신 차리고 봐라!!!
		  
		  //계좌 이체 확인 -> 잔액 출력
		  System.out.println(copy); 
          
		  		  
		  
		  
		  
		 //실수 < - > 실수
		 float f1; //원본
		 double d1;
		 
		 f1 = 3.14F;
		 
		 //double = float
		 //큰형(8) = 작은형(4)
		 d1 =(double)f1 ;
		 
		 System.out.println(d1);
		 
		 float f2;
		 double d2;
		 
		 d2 = 3.14;
		 		 
		 f2 =(float) d2;
		 
		 System.out.println(f2);
		 
		 
		 
		 //------------------------------------------------------------------
		 //정수형 상수는 자료형이 int이다.
		 
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
		 
		 // 정수 <-> 실수 
		 
		 int n3; //원본
		 double d3;
		 
		 n3 =100;
		 //8바이트 = 4바이트
		 //암시적 형변환 
		 d3 =n3;
		 
		 System.out.println(d3);
		 
		 int n4;
		 double d4; //원본
		 
		 d4 = 3.14;
		 
		 //int(4) = double(8)
		 //명시적 형변환
		 n4 = (int)d4;
		 
		 System.out.println(n4); //******주의 !!!
		  
		 
		 
		 //----------------------------------------------------
		 
		 long l5; 
		 float f5;
		 
		 l5 = 100;
		 
		 //4byte = 8byte
		 //명시적 형변환 -> 암시적 형변환
		 f5 =l5;
		  
		 long l6;
		 float f6; //원본
		 
		 f6 = 3.14F;
		 
		 //8byte = 4byte
		 //암시적 형변환 -> 명시적 형변환
		 l6 = (long)f6;
		 
		 //자료형 크기
		 //byte(1byte) < short(2byte) < int(4) < long(8) < float(4) < double(8)
		 //                        char(2)
		 
		  
		 // ---------------------------------------------------------------------
		 
		 char c7; //원본 
		 int n7;
		  
		 c7 = 'A';
		 
		 //int = char
		 //4 = 2
		 //큰형 = 작은형 
		 n7 = c7;
		 
		 System.out.println("n7: "+n7);
		 n7 = c7;
		  
		 char c8;
		 int n8;
		 
		 n8 = 97;
		 
		 //작은형 = 큰형
		 c8 =(char) n8;
		 
		 System.out.println("n8: "+c8);
		 
		 //-------------------------------------------------------------------------
		 
		 char c9; //2byte
		 short s9;//2byte
		 
		 c9 = '가'; //44035
		 
		 //short : -32768 ~ 32767
		 //char : 0 ~ 65535
		 s9 =(short)c9;
		 
		 System.out.println("s9: "+s9); //결과값: -21504
		 
		 // char 를 문자코드로 상호 변환할 때는 반드시 int를 사용해야 한다.         
		 
		 
	}

}
