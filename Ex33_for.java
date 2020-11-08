package com.test.java;

public class Ex33_for {
	
	public static void main(String[] args) {
		
		//제어문 중첩
		// - 모든 제어문끼리는 서로 중첩될 수 있다.
		
		//for문끼리 중첩
		//m1();
		//m2();
		//m3();
		m4();
		
	}

	private static void m4() {
		
		//for문 -> 별찍기
		for (int i=0; i<5; i++) { //행
			for (int j=0; j<5; j++) { //열
				System.out.print("*");
			}			
			System.out.println();
		}
		System.out.println();
		
		
		for (int i=0; i<5; i++) { //행
			for (int j=0; j<=i; j++) { //열
				System.out.print("*");
			}			
			System.out.println();
		}
		System.out.println();
		
		
		for (int i=0; i<5; i++) { //행
			for (int j=i; j<5; j++) { //열
				System.out.print("*");
			}			
			System.out.println();
		}
		System.out.println();
		
		
		for (int i=0; i<5; i++) { //행
			
			for (int j=0; j<=i; j++) { //열
				System.out.print(" ");
			}			
			
			for (int j=0; j<5; j++) { //열
				System.out.print("*");
			}			
			System.out.println();
		}
		System.out.println();
		
	}

	private static void m3() {
		
		//break, continue 개입
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				
				if (i == 5) {
				//if (j == 5) {
				//if (i == j) {
				//if (i == 5 || j == 5) {
					//자신이 포함된 제어문을 탈출해라(단, if문 빼고)
					//직접 포함된 제어문만 탈출한다.(j for 탈출)
					break;
				}
				
				System.out.printf("i : %d, j : %d\n", i, j);
				
			}
		}
		
	}

	private static void m2() {
		
		//학교
		// - 학년
		//	 - 반
		//	   - 번호
		
		//아파트
		// - 단지
		//   - 동
		//     - 층
		//       - 호
		
		//테이블
		// - 행
		//   - 열
		
		
		//2중 for문
		
		for (int j=2; j<10; j++) {
			
			System.out.println("==========");
			System.out.printf("    %d단\n", j);
			System.out.println("==========");
			
			for (int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %2d\n", j, i, j*i);
			}
		
			System.out.println();
		}
		
	}

	private static void m1() {
		
		//2중 for문
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				
				//System.out.println("실행문"); //이 영역의 실행 횟수!!!!
				System.out.printf("i : %d, j : %d\n", i, j);
				
			}
			
		}
		
		System.out.println();
		
		for (int hour=0; hour<12; hour++) {
			
			for (int min=0; min<60; min++) {
				
				System.out.printf("%02d:%02d\n", hour, min);
				
			}//min
			System.out.println();
			
		}//hour
		
		
		
		//3중 for문
		for (int i=0; i<24; i++) {
			for (int j=0; j<60; j++) {
				for (int k=0; k<60; k++) {
					System.out.printf("i : %d, j : %d, k : %d\n", i, j, k);
				}
			}
		}
		
		
		//몇 중 for문까지 필요한가?
		// -> 보통 2~3중 for문 사용
		
		
	}//m1

}
















