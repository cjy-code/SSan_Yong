package com.test.java;

public class Ex34_while {
	
	public static void main(String[] args) {
		
		//Ex34_while.java
		
		//반복문
		//1. for
		//2. while
		//3. do while
		//4. for(X)
		
		//m1();
		//m2();
		//m3();
		
	}

	private static void m3() {
		
		//구구단 2~9단
		int dan = 2;
		
		while (dan < 10) {
			
			int num = 1;
			
			while (num < 10) {
				
				System.out.printf("%d x %d = %2d\n", dan, num, dan*num);
				
				num++;
			}
			
			dan++;
			System.out.println();
		}
		
	}

	private static void m2() {
		
		//기존의 for문 예제 + 문제 -> while문 반복
		
		//누적
		// 1 ~ 100 합
		
		int sum = 0; //누적 변수
		int num = 1; //루프 변수
		
		while (num <= 100) {
			sum += num;
			num++;
		}
		
		System.out.println(sum);
		
		
		//1 + 2 + 3 + 4 + 5 + ... + N -> 누적합이 1000이면 탈출
		sum = 0;
		num = 1;
		
//		while (true) {
//			sum += num;
//			
//			if (sum > 1000) {
//				break;
//			}
//			
//			num++;
//		}
		
		
//		while (sum <= 1000) {
//			sum += num;
//			num++;
//		}
		
		for (num=1; sum<=1000; num++ ) {
			sum += num;
			
//			if (sum > 1000) {
//				break;
//			}
		}
		
		System.out.println("sum: " + sum);
		System.out.println(num);
		
	}

	private static void m1() {
		
		/*
		
		while문
		- for문 유사
		- 조건에 따라 반복 제어를 하는 제어문
		
		- 1회 실행		
		if (조건) {
			실행코드;
		}
		
		- 반복 실행 : 반복되는 if문
		while (조건) {
			실행코드;
		}
		
		*/
		
		//요구사항] 1 ~ 10까지 출력하시오.
		
		//for (초기식; 조건식; 증감식)
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		
		int num = 1; //초기식 역할
		
		while (num <= 10) { //조건식
			System.out.println(num);
			num++; //증감식 역할
		}
		System.out.println();
		
		
		
	}

}



















