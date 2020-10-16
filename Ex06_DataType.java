package com.test.java;

public class Ex06_DataType {
	
	public static void main(String[] args) {
		
		//숫자 변수 2개 + 더하는 연산과정과 결과를 출력
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println("a" + "b");
		System.out.println(a + "b");
		System.out.println("a" + b);
		

		System.out.println(a + "+" + b + "="+ a + b);
		
		// 숫자 형태의 데이터를 취급할 때 주의할 점!!
		
		// 주민등록번호 저장
		// - 9510201012345
		
		//형태 -> 숫자
		//길이 -> long
		
		long jumin = 9510201012345L;
		System.out.println("주민등록번호: " + jumin);
		
		jumin =0310201012345L;
		System.out.println("주민등록번호: " + jumin);
		
		//자바에서 숫자 상수 표기법 (정수에 한해서)
		// - 기수법 표기
		//1. 10진수
		//2. 8진수
		//3. 16진수
		//4. 2진수(X)
		
		int num = 10; //소스(10) -> 10진수
		System.out.println(num);
		
		num = 010;
		System.out.println(num);
		
		num =0x10; //소스(0xXXX)-> 16진수
		System.out.println(num);
		
		//상품 번호 저장
		// -0001, 0002, 0003, 0004
		
		int no = 0001;
		System.out.println(no); //1
		
		String no2 = "0001";
		System.out.println(no2);
		
		String jumin2 = "031020";
		System.out.println(jumin2);
		
		//*************** 숫자로 구성되어 있는 데이터의 자료형을 선정할 때 기준
		//1. 숫자 : 연산의 대상이 되는 경우
		//2. 문자열 : 그 이외 나머지
		
		//전화번호 -> 문자열
		//나이 -> 숫자 혹은 문자열
		
	
		
	}

}
