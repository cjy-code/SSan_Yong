package com.test.java;

public class Ex52_static {
	
	public static void main(String[] args) {
		
		//로봇 장난감 만들기
		// -> 만든 장난감의 개수를 세어보자
		
		//Case 1.
//		int count = 0; //누적 변수
//		
//		Robot r1 = new Robot();
//		count++;
//		
//		Robot r2 = new Robot();
//		//count++; //카운트 업무 누락
//		
//		Robot r3 = new Robot();
//		count++;
//		
//		//count라는 변수가 로봇의 개수가 맞는가?? > 물리적 확신!!! > X
//		System.out.println("총 개수: " + count + "개");
		
		
		
		//Case 2.
//		Robot r1 = new Robot();
//		//count라는 변수가 로봇의 개수가 맞는가?? > 물리적 확신!!! > O
//		r1.count++;
//		
//		Robot r2 = new Robot();
//		//r2.count++;
//		r1.count++;
//		
//		Robot r3 = new Robot();
//		//r3.count++;
//		r1.count++;
//		
//		System.out.println("총 개수: " + r1.count + "개");
		
		
		
		//Case 3.
//		Robot r1 = new Robot();
//		Robot.count++;
//		
//		Robot r2 = new Robot();
//		//Robot.count++; //누락
//		
//		Robot r3 = new Robot();
//		Robot.count++;
//		
//		System.out.println("총 개수: " + Robot.count + "개");
		
		
		
		//Case 4.
		Robot r1 = new Robot();
		Robot r2 = new Robot();
		Robot r3 = new Robot();
		
		System.out.println("총 개수: " + Robot.count + "개");
		
		
		//Case 4 > Case 3 > Case 1 >>>>>>> Case 2
		
		
	}

}

//로봇 장난감
class Robot {
	
	private String name;
	
	//public int count; //Case 2.
	public static int count; //Case 3.
	
	public Robot() {
		Robot.count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
















