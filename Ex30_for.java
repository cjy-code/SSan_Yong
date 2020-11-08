package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex30_for {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Ex30_for.java
		
		//반복문
		/*
		
		for문
		- 반복문
		- 일련의 실행 코드를 개발자가 원하는 반복실행하는 제어문
		
		for (초기식; 조건식; 증감식) {
			실행코드;
		}		
		
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		m8();
			
	}

	private static void m8() {
		
		//난수
		// - 임의의 수
		// - 난수 생성기
		
		//System.out.println(Math.PI);
		
		
		//Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0.Returned values are chosen pseudorandomly with (approximately)uniform distribution from that range. 
		
		//0.0 ~ 0.999999999999 사이의 값 반환
		//0(inclusive) ~ 1(exclusive)
		//System.out.println(Math.random());
		
		
		//주사위 만들기
		//1~6
		
		double num = Math.random();
		
		//0.0 -> 0.0 -> 0
		//0.1 -> 1.0 -> 1
		//0.2 -> 2.0 -> 2
		//..
		//0.9 -> 9.0 -> 9
		//0.9999999999999999 -> 9.999999999999999999 -> 9
		
		System.out.println(num);
		System.out.println(num * 10);
		System.out.println((int)(num * 10)); //0~9 사이의 정수
		
		
		for (int i=0; i<10; i++) {
			//0 ~ 9
			//1 ~ 10
			//System.out.println((int)(Math.random() * 10) + 1);
			
			//0 ~ 9
			//0 ~ 5
			//1 ~ 6
			//System.out.println((int)(Math.random() * 6) + 1);
			
			System.out.println((int)(Math.random() * 3) + 1);
		}
		
		
		
		
		
		
	}

	private static void m7() {
		
		//분기문
		// - break, continue
		
		//1. break
		// - 자신이 속한 제어문을 탈출한다.(종료한다.)
		// - 단, if문은 제외한다.(예외 사항)
		
		//2. continue
		// - 무조건 하던일 멈추고 반복문의 시작으로 돌아간다.
		
		for (int i=1; i<=10; i++) {
			
			//break;
			
			if (i == 5) {
				//break;
				continue;//skip
			}
			
			System.out.println(i);
			
			//break;
			
		}
		
		//**
		
		
		
		//학교 선생님 + 진로 상담(30명)
		for (int i=1; i<=30; i++) {
			
//			if (i == 16) {
//				break;
//			}
			
			//15번 결석
			if (i == 15 || i == 17 || i == 25) {
				continue;
			}
			
			System.out.printf("선생님이 %d번 학생을 상담합니다.\n", i);
			
		}
		
		
		
	}

	private static void m6() throws NumberFormatException, IOException {
		
		//요구사항] 사용자에게 10개의 숫자를 입력받아 그 수의 합을 구하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		int sum = 0;
		
		for (int i=0; i<10; i++) {
			
			System.out.print("숫자 입력: ");
			int num = Integer.parseInt(reader.readLine());
			
			//sum = sum + num;
			sum += num;
			
		}
		
		System.out.println(sum);
		
		
		
	}

	private static void m5() {
		
		//루프 -> 누적
		
		//요구사항] 1~10까지의 합을 구하시오.
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 -> 55
		
		//무언가의 누적값을 구해라
		//1. 누적 변수를 선언한다.
		// - 누적 변수는 반드시 초기화를 해야 한다.
		int sum = 0;
		
		//2. 누적할 데이터를 얻기 위한 수열을 만든다. -> for문
		for (int i=1; i<=10; i++) {
			
			//i : 지금 필요한 숫자 10개
			
			//3. 누적한다.(****)
			sum = sum + i;
			
		}
		
		System.out.println(sum);
		
		
	}

	private static void m4() {
		
		//변수
		//1. 클래스 멤버 변수
		//2. 지역 변수
		// - 메서드 안에서 선언된 변수
		// - 제어문 안에서 선언된 변수
		
		int a = 10; //지역변수(m4())
		
		if (a > 0) {
			
			System.out.println("a: " + a);
			
			int b = 20; //지역변수(if)
			System.out.println("b: " + b);
			
		}//if
		
		System.out.println("a: " + a);
		//System.out.println("b: " + b);
		
		
		
		
		for (int i=0; i<10; i++) {
			
			System.out.println(i);
			
		}
		
		//System.out.println(i);
		
		
		int num = 0;//지역변수(m4)
		
		for (num = 0; num<10; num++) {
			
			System.out.println(num);
			
		}
		
		//***
		
		System.out.println("num: " + num);
		
		
		
		//int i vs int n
		// - int i : 10바퀴 도는 동안 계속 살아있음.
		// - int n : 1바퀴 돌때마다 태어났다 죽었다 반복
		// - 생명주기가 다르다.
		for (int i=1; i<=10; i++) {
			
			int n = 10;
			System.out.println(n);
			n++;
			
		}
		
		
		
		
	}//m4

	private static void m3() {
		
		//구구단 출력
		// - 5단

		//5 x 1 = 5
		//5 x 2 = 10
		//5 x 3 = 15
		//...
		//5 x 9 = 45
		
		int dan = 3;
		
		for (int i=1; i<=9; i++) {
			
			//System.out.println(i);
			//System.out.println(i * 5);
			
			System.out.printf("%d x %d = %2d\n", dan, i, dan * i);
			
		}
		
		
	}

	private static void m2() {
		
		//for문 목적
		//1. 반복 횟수 제어 : 쉬움
		//2. 루프 변수값 제어 : 쉬움 ~ 어려움 (****************)
		
		
		for (int i=1; i<=5; i++) {
			System.out.println(i); //루프 변수 출력
		}
		System.out.println();
		
		
		for (int i=1; i<=10; i++) {
			System.out.println(i); //루프 변수 출력
		}
		System.out.println();
		
		
		for (int i=6; i<=10; i++) {
			System.out.println(i); //루프 변수 출력
		}
		System.out.println();
		
		
		for (int i=1; i<=10; i = i + 2) {
			System.out.println(i); //루프 변수 출력
		}
		System.out.println();
		
		
		for (int i=2; i<=10; i+=2) {
			System.out.println(i); //루프 변수 출력
		}
		System.out.println();
		
		
		
		for (int i=11; i<=10; i++) {
			System.out.println(i); //루프 변수 출력
		}
		System.out.println();
		
		
		//무한 루프
		//1. 인위적 작성
		//2. 실수로 작성
//		for (int i=10; i>0; i++) {
//			System.out.println(i); //루프 변수 출력
//		}
//		System.out.println();
		
		
		//무한 루프 생성
//		for (;;) {
//			System.out.println("무한루프");
//		}
		
//		for (int i=1;;) {
//			System.out.println(i);
//		}
		
//		for (int i=1; ;i++) {
//			System.out.println(i);
//		}
		
//		for (int i=1; true; i++) {
//			System.out.println(i);
//		}
		
		
	}

	private static void m1() {
		
//		for (초기식; 조건식; 증감식) {
//			실행코드;
//		}
		
		//요구사항] '안녕하세요' x 5 출력
		
		//int i : 루프 변수, Loop Variable
		for (int i=1; i<=5; i++) {
			
			System.out.println("안녕하세요.");
			
		}
		
		
		
		for (int i=1; i<=100; i++) {
			
			System.out.println("반갑습니다.");
			
		}
		
		
		
		
	}

}











