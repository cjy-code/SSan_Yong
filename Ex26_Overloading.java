package com.test.java;

public class Ex26_Overloading {
	
	public static void main(String[] args) {
		
		//Ex26_Overloading.java
		
		//오버로딩을 왜 하는지?
		// -> 개발자 편의성(개발자를 위한 기술)
		// -> 기억해야할 메서드의 이름을 줄여준다.(************)
		
		//요구사항] 선그리는 메서드를 만들어주세요.
		//추가사항] 선 모양이 다양했으면 좋겠습니다.
		
		drawLine();
		System.out.println("메서드 오버로딩, Method Overloading");
		drawLine();
		
		drawLine('?');
		drawLine('@');
		drawLine('-');
		
		drawLine('=', 10);
		drawLine('&', 20);
		
		
		//4 종류의 메서드명?
		// - drawLine
		// - drawLine2
		// - drawLine3
		// - drawLine4
		
		// - drawLine
	
		
		
		System.out.println("홍길동");	
		System.out.println(100);
		System.out.println(true);
		System.out.println('c');
		
		
	}//main
	
	public static void println(String str) {		
	}
	
	public static void println(int num) {		
	}
	
	public static void println(boolean flag) {		
	}
	
	public static void println(char c) {		
	}
	
	
	
	public static void drawLine() {
		
		System.out.println("==============================");
		
	}
	
	public static void drawLine(char c) {
		
		for (int i=0; i<30; i++) {
			System.out.print(c); //30회 반복 실행
		}
		System.out.println();
		
	}
	
	public static void drawLine(char c, int length) {
		
		for (int i=0; i<length; i++) {
			System.out.print(c); //30회 반복 실행
		}
		System.out.println();
		
	}
	
	public static void drawLine2() {
		
		System.out.println("******************************");
		
	}
	

}













