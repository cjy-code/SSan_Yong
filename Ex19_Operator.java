package com.test.java;

public class Ex19_Operator {
	
	public static void main(String[] args) {
		
		//1. 산술 연산자
		//2. 비교 연산자
		
		//3. 논리 연산자 
		// - &&, ||, !
		
		/*
		  영문 표기
		  ~(tild), !, @, #, $, %, ^(carret, xor), &, *, -, . ? ' , "
		  
		  '(quote), `(back quote)
		  
		 (), [], {}, <>
		 
		 A > B
		 A greater than B
		 A >= B
		 A Greater than equal B
		 
		 A < B
		 A less than B
		 
		 */
		
		//3. 논리 연산자
		// - &&(and), ||(or), !(not), ^(xor, exclusive or, 베타적 논리합)
		// - 피연산자를 대상으로 특정 규칙에 따라 정해진 결과를 반환 한다.
		// - &&, || : 2항 연산자 
		// - ! : 1항 연산자 
		// - 피연자의 자료형은 boolean을 가진다.
		// - 연간의 결과는 boolean을 반환한다.
		// - 논리 연산자를 주로 비교 연산자와 함꼐 사용한다.
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		
		//요구사항] 나이를 입력 -> 19세 이상 ~ 60세 미만
		int age = 25;
		
		//System.out.println(19 <= age < 60); (Error)
		//                    (true < 60)
		
		System.out.println("19 <= age: "+ (19 <= age));
		System.out.println("age < 60: "+(age < 60));
		
		//연산자 우선 순위
		//비교 연산자 > 논리 연산자
		System.out.println(19 <= age && age < 60);
		
		
		//문자 1개 입력 -> 영어 소문자?
		char c1 ='d';
		
		System.out.println("c1 >= 'a' && c1 < 'z': " +(c1 >= 'a' && c1 < 'z'));
		
		System.out.println();
		
		age = 25;
		String address = "서울";
		String gender = "남자";
		
		//질문] 나이가 20세 이상이고 주소가 서울인가?
		System.out.println(age >= 20 && address.equals("서울"));
		
		//질문] 나이가 20세 이상이거나 혹은 주소사 서울인가?
		System.out.println(age >= 20 || address.equals("서울"));
		
		//질문]  나이가 20세 이상이고 주소가 서울이며 성별이 남자인가?
		System.out.println(age >= 20 && address.equals("서울") && gender.equals("남자"));
		//질문]  나이가 20세 이상이고 주소가 서울이거나 혹은 성별이 남자인가?
		System.out.println(age >= 20 && address.equals("서울") || gender.equals("남자"));
		//질문]  나이가 20세 이상이거나 혹은 주소가 서울이며 성별이 남자인가?
		System.out.println(age >= 20 || address.equals("서울") && gender.equals("남자"));
		//질문]  나이가 20세 이상 또는 주소가 서울거나 혹은 성별이 남자인가?
		System.out.println(age >= 20 || address.equals("서울") || gender.equals("남자"));
		
		//논리(부정 연산자)
		// - !(not)
		// -1항 연산자 
		
		b1= true;
		
		System.out.println("!b1: "+ !b1);
		
		b2 = false;
		
		System.out.println("!b2: "+ !b2);
		
		age =25;
		
		System.out.println();
		
		System.out.println(age >= 19 && age < 60); // true
		
		System.out.println(!(age < 19 || age >= 60)); // 모르겠다 
		
		
		//4. 대입(할당) 연산자
		// - = 
	    // - +=, -=, *=, /=, %= : 복합 대입 연산자
		
		System.out.println();
		System.out.println();
		
		int n = 10;
		
		//누적(*********)
		n = n + 1;
		
		//1~3까지 합
		n = 1 + 2 + 3 ;
		
		//1~3까지 합 
		n = 0;
		n = n + 1;
		n = n + 2;
		n = n + 3;
		
		System.out.println(n);
		
		n += 5;
		System.out.println(n);
		
		int m =10;
		
		n= n +m ;
	
		System.out.println(n);
		
		n+= m;
		System.out.println(n);
		
		n = n -3;
		System.out.println(n);
		
		n -= 3;
		System.out.println(n);
		
		n = n *2 ;
		System.out.println(n);
		
		n *= 2;
		System.out.println(n);
		
		n = n/2;
		System.out.println(n);
		
		n /= 2;
		System.out.println(n);
		
		n = n % 8;
		System.out.println(n);
		
		n %=8;
		System.out.println(n);
		
		//연산자 우선 순위
		// -(소괄호) > 산술 > 비교 > 논리 > 대입 
		
		//5. 증감 연산자 
		// - ++, -- 
		// 1항 연산자
		// 피연산자는 숫자를 사진다
		// 피연산자의 값을 +1, -1 누적 시킨다
		//---------------------------------------------------------
	    
		System.out.println();
		System.out.println();
		
		n =10;
		int Sum =0;
		
		Sum = 20 + ++n;
		
		
		System.out.println("++n: "+Sum);
		
		n =10;
		Sum =0;
		
		Sum = 20 + n++;
		System.out.println("n++: "+Sum);
		System.out.println(n);
		
		//증감 연산자는 전치/후치에 따라 우선 순위가 바뀌기 때문에 사용하기 힘들가.( 가독성 낮다)-> 그니까 사용하지 말자 !!
		
		// 하나의 문장안에 증감 연산자와 다른 연산자를 같이 다른 연산자와 다른 연산자를 같이 쓰지 말자!!
		
		int o = 10;
		System.out.println(--o - o--);
		
		//6. 조건 연산자 
		// - ?:
		// - 3항 연산자
		// - A ? B : C
		// - A : boolean
		// - B, C : 상수, 변수, 계산식 -> 값
		// - B와 C는 자료형이 동일해야 한다.
		
		
		int result1 = true ? 10 : 20;
		
		System.out.println(result1);
		
		age = 15; 
		// 19세 이상 ~ 60세 미만 : 통과
		
	    System.out.println(age >= 19 && age < 60);
	    
	    String result2 = (age >= 19 && age < 60) ? "통과" : "실패";
	    System.out.println(result2);
	    
	    System.out.printf("입력하신 나이 %d세는 회원 가입 %s입니다.", age, result2);

		
		
		
	}

}
