package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex28_if {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		
		제어문
		- 조건문, 반복문, 분기문
		- 프로그램 코드의 실행 순서나 횟수를 제어
		- 알고리즘 생산 도구
		
		조건문
		1. if
		2. switch
		
		반복문
		1. for
		2. while
		3. do while
		4. enhanced for(=foreach). 향상된 for
		
		분기문
		1. break
		2. continue
		3. goto(JDK 1.5 폐지)				
		
		
		
		
		if statement, if문
		- 조건을 제시한 후 코드의 흐름을 분기 시키는 제어문
		- 조건 : boolean
		
		if (조건) {
			실행코드;
		}
		
		if (조건) {
			실행코드;
		} else {
			실행코드;
		}
		
		if (조건) {
			실행코드;
		} else if (조건) {
			실행코드;
		} else if (조건) {
			실행코드;
		} else if (조건) {
			실행코드;
		}
		
		
		if (정각에 있어났나?) {
			아침을 먹는다.
		}
		
		출근을 한다.
		
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();
		
		
		
		int n = 10;
		
		System.out.println((n % 2 == 0) ? "짝수" : "홀수");
		
		if (n % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
		
		
		
		
	} //main

	private static void m6() {
		
		//옷가계 -> 사이즈 -> 90, 95, 100, 105, 110, 115, 120
		// - 90 : S
		// - 95 ~ 105 : M
		// - 110 ~ 120 : L
		
		int sel = 100;
		
		if (sel == 90) {
			System.out.println("S 사이즈가 맞습니다.");
		} else if (sel >= 95 && sel <= 105) {
			System.out.println("M 사이즈가 맞습니다.");
		} else if (sel >= 110 && sel <= 120) {
			System.out.println("L 사이즈가 맞습니다.");
		} else if (sel < 90 || sel > 120) {
			System.out.println("저희는 취급하지 않는 사이즈입니다.");
		}
		
		
		//중첩(nested) if문
		if (sel >= 90 && sel <= 120) {	
			
			if (sel == 90) {
				System.out.println("S 사이즈가 맞습니다.");
			} else if (sel >= 95 && sel <= 105) {
				System.out.println("M 사이즈가 맞습니다.");
			} else if (sel >= 110 && sel <= 120) {
				System.out.println("L 사이즈가 맞습니다.");
			}
			
		} else {
			System.out.println("취급하지 않은 사이즈입니다.");
		}
		
	}

	private static void m5() {
		
		String language = "c++"; //java, sql, html, spring
		
		if (language.equals("java")) {
			System.out.println("응용 프로그램 개발 부서에 배치합니다.");
		} else if (language.equals("sql")) {
			System.out.println("데이터베이스 부서에 배치합니다.");
		} else if (language.equals("html")) {
			System.out.println("클라이언트 부서에 배치합니다.");
		} else if (language.equals("spring")) {
			System.out.println("서버 부서에 배치합니다.");
		} else {
			System.out.println("해당 인력을 자사에 필요없는 인력입니다.");
		}
		
		
	}

	private static void m4() {
		
		int num = 0; //사용자 입력
		
		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else if (num == 0) {
			System.out.println("0");
		}
		
		
		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
		System.out.println("프로그램 종료");
		
		
	}

	private static void m3() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		
		int num = Integer.parseInt(reader.readLine());
		
		if (num > 0) { //if 블럭
			
			System.out.println("양수입니다.");
			
		} else { //else 블럭
			
			System.out.println("양수가 아닙니다.");
			
		}
		
		
		System.out.println("프로그램 종료");
		
		
	}

	private static void m2() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("정각에 일어났습니까?");
		System.out.println("1. 일어났다.");
		System.out.println("2. 늦잠잤다.");
		System.out.print("번호선택: ");
		
		String input = reader.readLine();
		
		if (input.equals("1")) {
			System.out.println("아침을 먹는다.");
		}
		
		System.out.println("출근을 한다.");
		
	}

	private static void m1() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		
		int num = Integer.parseInt(reader.readLine());
		
		//숫자가 양수인지?
		if (num > 0) {
			
			System.out.println("양수입니다.");
			
		}
		
		System.out.println("프로그램 종료");		
		
	}
	
}












