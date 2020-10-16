package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13_BufferedReader {
	
	public static void main(String[] args) throws IOException {
		
		//에러, Error
		//- 오류, 버그(Bug), 예외(Exception) 등
		
		//1. 컴파일 오류
		// - 컴파일할 때 발생하는 오류
		// - 소스 코드 -> 기계어(Machine Code), 이진코드(Binary Code)
		// - 컴파일러가 번역을 할때 문법이 올바른지 확인하는 과정에서 발견
		// - 컴파일 작업을 중단(번역 중지)
	    // - 난이도 가장 낮음 -> 발견 쉬움 -> 고치기 쉬움
		// - 컴파일러가 어떤 오류가 발생했는지를 알려준다
		// - 오타
		
		int a= 10; 
		
		
		//2. 런타임 오류
		// -
		// - 컴파일 작업떄는 발견이 안됐는데 실행 중에 발견 되는 오류
		// - 예외(Exception)
		// - 발견 난이도 중급. 복불복
		// - 모든 경우의 수를 미리 예측해서 테스트를 해야 한다. -> 어떻게든 미리 발견!!
		// - 1. 사람을 동원
		// - 2. 프로그램 (테스트용 프로그램)
		
		//사용자 입력 ->숫자 입력 -> 연산 -> 결과 출력
		int num = 0;
		//System.out.println(100 / num);
		
		
		//3. 논리 오류
		// - 문법도 틀린곳이 없고, 실행도 잘되는데 .....? 결과가 이상함???
		// - 발견 힘듬. 수정 난이도 높음
		
		// 요구사항] 사용자의 태어난 년도를 입력받아 나이를 출력하시오.
		
		System.out.print("생년 입력(ex.1995): ");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		int year = Integer.parseInt(data);
	    
		
		int age = 2020 - year;
		System.out.printf("%d년생은 현재 %d세 입니다.", year, age +1);
		
		
		//readLine() 메소드는 모든 입력 데이터가 문자열(String)로 반환된다.
		// -> 입력된 문자열(String)을 다른 자료형으로 바꾸는 기능
		
		//"문자열" -> byte: Byte.parseByte("10")
		//"문자열" -> short: Short.parseShort("10")
		//"문자열" -> int: Integer.parseInt("10")
		//"문자열" -> long: Long.parseLong("10")
		
		//"문자열" -> float : Float.parseFloat("3.14")
		//"문자열" -> double: Double.parseDouble("3.14")
		
		//"문자열" -> boolean : Boolean.parseBoolean("true")
		
	    char c1 = 'A';
	    String c2 = "A";
	    
	    //"A" -> 'A'.charAt(0)
	    
	    
	    
		
	}

}
