package com.test.java;

public class Ex18_Operator {
	
	public static void main(String[] args) {
		
		//메모리 영역(구역)
		// 1.stack 영역
		// -개발자가 만든 모든 변수는 이 영역에 생성된다.
		
		
		// 2.Heap영역
		
		//비교 연산자 
		// - ==, !=
		//1. 숫자 == 수자 
		//2. 문자열 == 문자열
		
		int n1 = 100;
		int n2 = 200;
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "아무개";
		
		//참조형 변수의 비교는 주소값을 비교한다.(*********************)
		System.out.println("s1 == s2: "+s1 == s2); //절대로 사용하면 안된다.
		System.out.println("s1 == s3: "+s1 == s3); //절대로 사용하면 안된다.
		
		String s4 = "홍길동";
		String s5 = "홍";
		s5 = s5 + "길동"; //홍길동
		
		System.out.println("s4: "+s4);
		System.out.println("s5: "+s5);
		
		System.out.println("s4==s5: "+ (s4 == s5));
		
		//문자열의 비교는 == 연산자를 사용하지 않고 equals() 메서드를 사용한다.( ***********)
		System.out.println(s4.equals(s5)); // true
		
		//참조형 == 참조형 : 주소값 비교
		//참조형.eaquals(참조형) : 값(데이터) 비교
		
		
	}

}
