package com.test.java;

public class Ex08_Output {
	
	public static void main(String[] args) {
		
		//콘솔 출력
		// - 모니터 사용
		// - 자바에서 사용자에게
		
		//콘솔 출력 명령어 
		//1.System.out.println(); 메서드
		// - System: 클래스
		// - out: 필드
		// - println
		
		int num = 100;
		String name = "홍길동";
		
		//콘솔 출력
		//1. 
		System.out.println(num);//변수 출력
		System.out.println(name);
		
		System.out.println(200);//상수 출력
		System.out.println("아무개");
		
	    System.out.println(10 + 20); //연산 결과 출력
	    
	    //2. print
	    System.out.print(num);
	    System.out.println(name);
	    
	    name = "홍길동";
	    
	    int kor = 90;
	    int eng = 80;
	    int math =70;
	    int total = kor + eng + math; //총점
	    
	    System.out.println("[" + name + " 성적표]");
	    System.out.println("[국어]\t[영어]\t[수학]");
	   
	    System.out.print(kor);
	    System.out.print("\t");
	    System.out.print(eng);
	    System.out.print("\t");
	    System.out.print(math);
        System.out.print("\t");
	    System.out.print("\n");
	    
	    System.out.print(kor + "\t");
	    System.out.print(eng + "\t");
	    System.out.print(math + "\t");
        
        System.out.println(kor + "\t" + eng + "\t" +math);
        System.out.println("총점: 240점");
	    System.out.print(total);
	    
	    System.out.println();
	    System.out.println();
	    
	    //3.printf
	    // - print format
	    // - 형식을 갖춰서 출력하는데 편리안 메서드
	    
	    // 요구사항] 안녕하세요. 홍길동님 -> 출력
	    name = "아무개";
	    System.out.println("안녕하세요. " + name + "님");
	    
     	// 요구사항] 안녕하세요. 홍길동님. 반갑습니다. 홍길동님. -> 추가 출력
	    System.out.println("안녕하세요. " + name + "님. 반갑습니다. " + name + "님.");
	    
	    //개발자는 코드를 작성 -> 현재 생각 X -> 미래 생각 O
	    // -> 추후 유지보수(수정)
	    System.out.println("안녕하세요. 홍길동님. 반갑습니다. 홍길동님.");
	    
	    //printf
	    // - 형식 문자열 사용
	    //1. %s : String
	    //2. %d : Decimal(Byte, Short, int, long)
	    //3. %f : Float(float, double)
	    //4. %c : Char
	    //5. %d : Boolean
	    //6. %n : New Line
	    name = "홍길동";
	    System.out.println("안녕하세요 " + name + "님.");
	    System.out.printf("안녕하세요. %s님. \n",name);
	    
	    //요구사항]안녕하세요. 홍길동님. 반갑습니다. 홍길동님 -> 추가 출력
	    System.out.printf("안녕하세요. %s님. 반갑습니다. %s님", name, name);
	    
	    //Oracle > SQL 구문 
	    //insert into tblMenber(seq, name, age, address, tel) values(1, '홍길동', 20, '서울시 강남구', '010-1234-5678')
	    
	    String seq = "1";
	    name ="홍길동";
	    String age ="20";
	    String address = "서울시 강남구";
	    String tel = "010-1234-5678";
	    
	    String sql ="insert into tblMenber(seq, name, age, address, tel) values("+ seq + ", '" +name+ "'," + age+ ", '"+ address +"', '"+tel+"')";	    
	    
	    
	    //printf
	    
	    System.out.printf("into tblMenber(seq, name, age, address, tel)" + "values (%s, '%s', %s, '%s','%s',)", seq, name, age, address, tel);
	    
	    
	    System.out.println();
	    System.out.println();
	    
	    System.out.printf("문자열 : %s\n", "홍길동");
	    System.out.printf("정수 : %d\n", 100);
	    
	    int a =10;
	    int b =20;
	    
	    System.out.printf("%d + %d = %d\n", a, b, a+b);
	    
	    //형식 문자 추가 기능
	    //1. %숫자d
	    // - 출력 자릿수 지정
	    // - +(우측정렬)
	    // - -(좌측 정렬)
	    // - %d, %s, %f, %c, %b 모두 사용 가능 
	    
	    //Ctrl + Alt +방향키 (위, 아래)
	    
	    //Alt + 방향키 (위, 아래)
	   
	    
	    //2. %,d
	    // -천단위 표기 (3자리마다 ',' 찍기)
	    
//	    System.out.printf("가나다라%마바사", 10);
//	    System.out.printf("가나다라%10d마바사", 10);
//	    System.out.printf("가나다라%5d마바사", 10);
//	    System.out.printf("가나다라%-10d마바사", 10);
	    
	    System.out.println();
		System.out.println("======================");
		System.out.println("음료 가격(단위: 원)");
		System.out.println("======================");
		System.out.printf("1. 콜라:\t %,5d\n", 2500);
		System.out.printf("2. 스무디:\t %,5d\n", 4500);
	    System.out.printf("3. 박카스:\t %,5d\n", 500);
	    System.out.printf("4. 아메리카노:\t %,5d\n", 2000);
	    
	    
	    System.out.println();
	    
	    double pi =3.14;
	    
	    System.out.printf("파이 : %f\n", pi);
	    System.out.printf("파이 : %.1f\n", pi);
	    System.out.printf("파이 : %.2f\n", pi);
	    System.out.printf("파이 : %.3f\n", pi);
	    System.out.printf("파이 : %.0f\n", pi);
	    
	    
	}

}
