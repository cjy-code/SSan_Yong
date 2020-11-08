package com.test.java;

public class Ex25_Overloading {
	
	public static void main(String[] args) {
		
		//Ex25_Overloading.java
		
		//메서드 오버로딩, Method Overloading
		// - 메서드가 인자 리스트를 다양한 형태로 가질 수 있는 기술
		// - 이를 통해 같은 이름의 메서드를 여러개 선언하는 기술
		
		//메서드 시그너쳐, Method Signature
		// - 메서드 헤더 부분
		
		//메서드 오버로딩 조건 O
		//1. 인자의 개수
		//2. 인자의 타입
		
		//메서드 오버로딩 조건 X
		//1. 인자의 이름
		//2. 반환값의 타입
		
		
		//메서드 호출
		test(); //1.
		
		test(10); //3.
		test("홍길동"); //5.
		test(10, 20); //6.
		
		//int result = test(); //9.
		
		
		
	} //main
	
	//1.
	public static void test() {
		System.out.println("1");
	}
	
	//2. 1번 때문에 실패
//	public static void test() {
//		System.out.println("2");
//	}
	
	//3. 성공
	public static void test(int a) { //test(10);
		System.out.println("3");
	}
	
	//4. 3번때문에 실패
	//public static void test(int bbb) { //test(10);
	//	System.out.println("4");
	//}
	
	//5.
	public static void test(String a) { //test("홍길동")
		System.out.println("5");
	}
	
	//6.
	public static void test(int a, int b) { //test(10, 20)
		System.out.println("6");
	}
	
	//7.
	public static void test(int a, String b) { //test(10, "홍길동")
		System.out.println("7");
	}
	
	//8.
	public static void test(String a, int b) { //test("홍길동", 10)
		System.out.println("8");
	}
	
	//9. 1번때문에 실패
	//public static int test() {
	//	System.out.println("9");
	//	return 100;
	//}
	
	
	
	
	
	

}














