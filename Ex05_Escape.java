package com.test.java;

public class Ex05_Escape {
	public static void main(String[] args) {
		
		//Ex05_Escape.java 
		
		//특수 문자 > Escape Sequence
		/* -컴파일러에게 미리 약속된 특정 표현을 전달하면 -> 번역 시(실행 시) 그 약속된 특징에 해당하는 행동을 하기로 미리 약속한 문자 */
		
		//1. \n
        // -new line
		// -개행 문자(엔터)
		// - \n 만나면 엔터를 쳐라
		
		char c1 = '\n';
		
		String s1 = "안녕하세요.\n홍길동입니다.";
		System.out.println(s1);
		
		//2. \r
		// - carriage return
		// - 캐럿의 위치를 현재 라인의 첫번째 열로 이동해라 -> Home 키를 눌러라
		
		s1= "안녕하세요.\r아무개";
		System.out.println(s1);
		
		//\r + \n
		//타자기
		
		//운영체제 or 개발환경
		// -엔터
		// 1. \r\n
		// 2. \r
		// 3. \n
		
		//3. \t
		// - tab
		// - 탭문자
		// - 탭이 뭡니까? 4칸, 8칸 띄어쓰기...
		// -서식용
        
		s1 = "홍길동\t입니다.";
		System.out.println(s1);
		
		//4. \b
		// - backspace
		s1 = "홍길\b동입니다.";
		System.out.println(s1);
		
		//5. \", \', \\
		
		//화면 출력 > 홍길동: "안녕하세요."
		
		s1 = "홍길동: \"안녕하세요.\""; // escape
		System.out.println(s1);
		
		//현재 수업중인  폴더의 경로를 출력하시오.
		//D:\class\java
		
		s1 = "D:\\class\\java";
		System.out.println(s1);
		
		
	
	
	
	}

}
