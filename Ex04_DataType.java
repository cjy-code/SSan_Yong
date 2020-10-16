package com.test.java;

public class Ex04_DataType {
	public static void main(String[] args) {
		
		// 8종류의 자료형 
		// -> 변수 + 데이터 + 사용
		
		// 정수형
		
		byte b1;
		b1 = 100;
		System.out.println("byte: " + b1);
		
		byte b2;
		b2 = 127; // 이큽립스는 실시간으로 javac.exe왕 연동해서 문법을 감시한다.
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
		
		
		//자료형 변수명 = 상수(데이터);
		byte num1 = 10;
		short num2 =10;
		int num3 = 10;
		long num4 = 10;
		
		
		
		
		//실수형 
		// - 실수형 상수는 double로 취급한다.
		
		//단정도형
		float f1;
		f1 =3.14F;
		System.out.println("float: " + f1);
		
		//배정도형
		double d1;
		d1 = 5.31;
		System.out.println("double: " + d1);
		
		
		f1 = 1.2345678901234567890123456789F;
		d1 = 1.2345678901234567890123456789D;
	    
		System.out.println("float: " + f1);
		System.out.println("double: " + d1);
		
		
		//문자형 
		// - char
		// - 2byte -> 유니코드(Unicode)
		
		char c1;
		c1 = 'A'; // 문자형 상수(문자형 리터럴) ->'문자' : 문자형 상수 표기법
	    System.out.println(c1);
	    
	    c1 = 'B';
	    System.out.println(c1);
	    
	    c1 = '가';
	    System.out.println(c1);
	    
	    c1 = '&';
	    System.out.println(c1);
	    
	    //c1 = 'AB';
	    //System.out.println(c1);
		
		//논리형 
		// - boolean(bool)
	    boolean flag;
	    
	    flag = true; //1
	    System.out.println(flag);
	    
	    flag = false; //0
	    System.out.println(flag);
	    
	    //값형
	    // - 숫자(정수): byte(1), short(2), int(4), long(8)
	    // - 숫자(실수): float(4), double(8)
	    // - 문자: char(2);
	    // - 논리: boolean(1)
		
	    //문자열
	    // -자료형 중 하나
	    // -값 형(X), 참조형(O)
	    // -문자의 집합
	    // -String
	    
	    //학생 정보
	    // -이름 저장 -> 홍길동
	    char name1 = '홍';
	    char name2 = '길';
	    char name3 = '동';
	    
	    System.out.print(name1);
	    System.out.print(name2);
	    System.out.println(name3);
	    
	    System.out.println("" + name1 + name2 + name3);
	    
	    //문자열
	    // -홍길동 -> '홍' + '길' + '동'
	    //자바에서 String의 최대 길이는 2147483647
	    
	    String name;
	    name = "홍길동"; //문자열 상수(문자열 리터럴) -> "문자열" : 문자열 리터럴 표기법
	    
	    System.out.println(name);
	    
	    String str;
	    
	    str = ""; //빈문자열, Empty String - 프로그램상에서 필요에 따라 초기화하는 용도로 잘 사용
	    System.out.println(str);
	    
	    //9개의 자료형
	    
	    int m1= 10;
	    System.out.println(m1);
	    
	    int m2 = 20; // 변수를 생성하고 난 직후 -> NULL 상태, NULL값을 가진다. -> 아무것도 없다
	    System.out.println(m2);
	    
	    /* ****자바에서는 (지역)변수를 초기화하지 않은 상태에서는 사용(연산, 출력 등)할 수 없다
	    int m3;
	    System.out.println(m3); //The local variable m3 may not have been initialized */
	    
	    
	    
	    
	}

}
