package com.test.java;

import java.io.IOException;

public class Ex09_Input {
	
	public static void main(String[] args) throws IOException {
		
		
		//콘솔 입출력
		// 1. 출력
        //   a.print()
		//   b.println()
		//   c.printf()
		
		//  2. 입력
		//   a. read(): 불편함, 동작원리
	            //- 입력한 문자의 문자코드값을 반환하는 역할
		        //- 한번 실행에 1글자만 반환한다.
		        //- 바이트 단위의 읽기 도구(한번에 1Byte씩만 읽는다)
		//   b. BufferedReader 클래스 : 실사용
		//   c. Scanner 클래스 : 실사용
		
		
		//요구사항] 사용자로부터 문자 1개를 입력받으시오. 받은 문자를 화면에 출력하시오.
		//입력] A 
		//결과] A 
		
		System.out.print("입력] ");
		
		//사용자로부터 키보드를 입력을 받습니다.
		// -사용자의 키보드 입력은 엔터를 쳐야 끝난다.(******)
		int data = System.in.read(); //입력 대기 상태 -> 블럭 걸렸다.
		
		//A(65) ~Z(90)
		//a(97) ~z(122)
		//0(48) ~9(57)
		
		System.out.println(data);
		
		System.out.println("종료합니다ㅎㅎ.");
		
		
	}

}
