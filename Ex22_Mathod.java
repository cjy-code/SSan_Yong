package com.test.java;

public class Ex22_Mathod {
	
	public static void main(String[] args) {
		
		//메소드 인자 리스트
		
		//메소드 인자 리스트
		// - 파라미터
		// - 인자 (Argument)
		// - 매개변수
		// - 가인자/실인자, Form parameter/ Real parameter
		
		//요규사항] '홍길동'에게 인사하는 메서드를 작성하시오.
		
		hello();
		
		//변경사항] '아무개'에게 인사하는 메서드를 작성하시오.
		
		hello2();
		
		//변경사항] 우리반(31명) 모두 각자에게 인사하는 메서드를 작성하시오.
		//-> 메서드 31개 만들어야 함.
		
		//변경사항] 우리나라 전국민에게 인사하는 메서드를 작성하시오.
		//-> 메서드 5,164만개 만들어야 함.
		
		hi("홍기리리리동동동");
		
		int a = 10;
		
		m1(a);
		m1(10);
		
		String b = "홍길동";
		//매개변수의 자료형과 인자값의 자료형을 반드시 동일해야 한다.
		//m1(b);
		
		short c =10;
		m1(c);
		
		double d = 10;
		m1((int)d);
		
		
		//***** 메서드가 매개변수가 존재하면 반드시 인자값을 전달하면서 호출해야 한다. -> 메서드 호출 불가능
		
		//m1();
		
		m2("홍길동", 20);
		
		m3(10,20);
		m3(100, 250);
		m3(1000000000,2000000000);
		
		//********** 메서드를 사용하는 측에서는 메서드 내부에서 어떤일이 일어나는지 알 필요가 없다.
		m4("할아버지",70);
		m4("꼬맹이",10);
		
	}// main
	
	public static void hello() { 
		
		System.out.println("홍길동님 안녕하세요.");
		
	}
	
    public static void hello2() { 
		
		System.out.println("아무개님 안녕하세요.");
		
	}
    
    public static void hi(String name ) { 
    	
    	//String name = "홍길동";
    	System.out.printf("%s님 반갑습니다.\n", name);
    	
    }
    
    public static void m1(int num) { 
    	
    	System.out.println("num: " + num);
    	
    }
    
    public static void m2(String name, int age) {
    	System.out.printf("이름: %s\n나이: %d세", name, age);
    }
    
    public static void m3(int a, int b) {
    	System.out.printf("%,d + %,d = %d\n", a, b, a+b);
    	
    
    }
    
    public static void m4(String name, int age) {
    	//성인: 안녕하세요. 홍길동님.
    	//아이: 안녕 ~ 길동아 ~
    	
    	String result = age >= 14? "안녕하세요." : "안뇽~";
    	System.out.printf("%s %s\n",result,name);
    }

}
