package com.test.java;

public class Ex16_Operator {
	
	public static void main(String[] args) {
		
		//연산자, Operator
		// - 피연산자 (Operand)를 대상으로 미리 정해진 연산(계산, 행동)을 한 후에 결과값을 반환하는 요소
		// - 주로 기호를 사용해서 표현 
		
		//1. 문장(Statement)
		//2. 표현식(Expression)
		//3. 연산자 
		//4. 피연산자
		//5. 연산자 우선순위
		//6. 연산 방향 
		
		//연산자의 종류
		//1. 산술 연산자 
		//- +, -, *, /, % (나머지, mod)
		//- 2항 연산자
		//- 피연산자를 숫자로 가진다. (정수, 실수)
		
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
		
		//나누기 연산자 
		// -정수/정수 = 정수
		// -실수/정수 = 실수
		// -정수/실수 = 실수
		// -실수/실수 = 실수
		
		// ***** 모든 산술 연산의 결과 자료형은 두 피연산자의 자료형 중 더 큰 자료형으로 반환된다.
		
		System.out.println(10 / 3);
		System.out.println(10.0 / 3);
		System.out.println(10 / 3.0);
		System.out.println(10.0 / 3.0);
		
		int n1 = 2000000000;//20억
		int n2 = 2000000000;
		int n3;
		
		n3 = n1 + n2;
		
		System.out.println("n3: " +	n3);
		
		//int + int = int
		//long + int = long
		System.out.println(2000000000L + 2000000000);
		
		
		
	    	
		
		
	    
		
		
		
		
		
		
		
		
		
	}

}
