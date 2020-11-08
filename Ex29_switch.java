package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex29_switch {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Ex29_switch.java
		
		//조건문
		//1. if
		//2. switch
		
		/*
		
		
		if (조건) {
			실행코드;
		} 
		[else if (조건) {
			실행코드;
		}] x N
		[else {
			실행코드
		}]
		
		
		
		switch문
		
		switch (조건값) {
			case 값:
				실행코드;
				break;
			[case 값:
				실행코드;
				break;] x N
			[default:
				실행코드;
				break;]
		}
		
		
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
				
	}

	private static void m5() {
		
		//2020년 10월이 며칠까지?
		int month = 10;
		int lastDate = 0;
		
		switch(month) {
			case 1:
				lastDate = 31;
				break;
			case 2:
				lastDate = 28;
				break;
			case 3:
				lastDate = 31;
				break;
			case 4:
				lastDate = 30;
				break;
			case 5:
				lastDate = 31;
				break;
			case 6:
				lastDate = 30;
				break;
			case 7:
				lastDate = 31;
				break;
			case 8:
				lastDate = 31;
				break;
			case 9:
				lastDate = 30;
				break;
			case 10:
				lastDate = 31;
				break;
			case 11:
				lastDate = 30;
				break;
			case 12:
				lastDate = 31;
				break;
		}
		
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDate = 31;
				break;
			case 2:
				lastDate = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lastDate = 30;
				break;
		}
		
		System.out.println(lastDate);
		
		
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2020, 1, 1);
		
		System.out.println(c1.getActualMaximum(Calendar.DATE));
		
		
		
		
		
	}

	private static void m4() throws NumberFormatException, IOException {
		
		//간단한 자판기
		// -> 메뉴 출력 -> 선택 -> 가격 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("===================");
		System.out.println("    음료 자판기");
		System.out.println("===================");
		System.out.println("1. 콜라");
		System.out.println("2. 스프라이트");
		System.out.println("3. 오렌지");
		System.out.println("-------------------");
		System.out.print("번호선택: ");
		
		int input = Integer.parseInt(reader.readLine());
		
		switch(input) {
			case 1:			
			case 2:
				System.out.println("1700원입니다.");
				break;
			case 3:
				System.out.println("2000원입니다.");
				break;
		}
		
	}

	private static void m3() {
		
		String color = "red";
		
		switch(color) {
			case "red":
				System.out.println("빨강");
				break;
			case "blue":
				System.out.println("파랑");
				break;
			case "yellow":
				System.out.println("노랑");
				break;
		}
		
		
		int a = 10;
		int b = 5;
		
		//switch의 조건은 정수밖에 사용할 수 없다.
		// -> 자바에서는 정수와 문자열을 할 수 있다.
		
//		switch (a > b) {
//			case true:
//				System.out.println();
//				break;
//			case false:
//				System.out.println();
//				break;
//		}
		
	}

	private static void m2() {
		
		int n = 5;

		switch (n) {
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			default: //if문의 else절 역할
				System.out.println("기타");
				break;
		}

	}

	private static void m1() {
		
		int n = 2; //1 -> "하나", 2 -> "둘", 3 -> "셋"
		
		if (n == 1) {
			System.out.println("하나");
		} else if (n == 2) {
			System.out.println("둘");
		} else if (n == 3) {
			System.out.println("셋");
		}
		
				
		
		switch (n) {
			case 1:  // 1: - Label
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
		}
		
		System.out.println("종료");
		
		
	}

}













