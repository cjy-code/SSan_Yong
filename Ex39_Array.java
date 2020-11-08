package com.test.java;

import java.util.Arrays;

public class Ex39_Array {

	public static void main(String[] args) {
		
		//배열의 차원
		// - 1차원 배열
		// - 2차원 배열
		// - 3차원 배열
		//.....
		// - N차원 배열
		
		//m1();
		//m2();
		m3();
		
	} //main

	private static void m3() {
		
		//5x5
		int[][] nums = new int[5][5];
		
		//배열의 각 방에 데이터 입력
		// 1, 2, 3, 4, 5... ,25
		int n = 1;
		
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[0].length; j++) {
				nums[i][j] = n;
				n++;
			}
		}
		
		
		//Arrays.toString() : 1차원 배열만 출력
		//System.out.println(Arrays.toString(nums));
		
		//System.out.println(Arrays.deepToString(nums));
		
		output(nums);
		
	}

	private static void output(int[][] nums) {
		
		for (int i=0; i<nums.length; i++) { //행
			for (int j=0; j<nums[0].length; j++) { //열
				System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void m2() {
		
		//배열 초기화 리스트
		//int[] nums1 = new int[] { 10, 20, 30 };
		int[] nums1 = { 10, 20, 30 };
		
		//int[][] nums2 = new int[][] { { 10, 20, 30 }, { 10, 20, 30 } };
		int[][] nums2 = { { 10, 20, 30 }, { 10, 20, 30 } };
		
		int[][][] nums3 = new int[][][]  //new int[3][2][4]
				{
					{
						{10, 20, 30, 40}, 
						{50, 60, 70, 80}
					}, 
					{
						{90, 100, 110, 120}, 
						{130, 140, 150, 160}
					}, 
					{
						{170, 180, 190, 200}, 
						{210, 220, 230, 240}
					}
				};
		
		
		
		
		
	}

	private static void m1() {
		
		//1차원 배열
		int[] nums1 = new int[3];
		
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;
		
		//2차원 배열
		int[][] nums2 = new int[2][3];
		
		nums2[0][0] = 100;
		nums2[0][1] = 200;
		nums2[0][2] = 300;
		nums2[1][0] = 400;
		nums2[1][1] = 500;
		nums2[1][2] = 600;
		
		
		
		//3차원 배열
		int[][][] nums3 = new int[2][3][4];
		
		nums3[0][0][0] = 100;
		nums3[0][2][1] = 200;
		nums3[1][0][3] = 300;
		nums3[1][2][3] = 400;
		nums3[1][1][0] = 500;
		
		
		//배열 탐색
		//1차원 배열 탐색 -> 첨자 1개 -> 단일 for문
		for (int i=0; i<nums1.length; i++) {
			System.out.printf("nums1[%d]=%d\n", i, nums1[i]);
		}
		System.out.println();
		
		//2차원 배열 탐색 -> 첨자 2개 -> 2중 for문
		for (int i=0; i<nums2.length; i++) {
			for (int j=0; j<nums2[0].length; j++) {
				System.out.printf("nums2[%d][%d]=%d\n", i, j, nums2[i][j]);
			}
		}
		System.out.println();
		
		
		System.out.println(nums2.length); //2 - 행
		System.out.println(nums2[0].length); //3 - 열
		System.out.println(nums2[1].length);
		
		
		//int num;
		//int[] nums1 = new int[3];
		//int[][] nums2 = new int[2][3];
		
		//1. num의 자료형이 뭡니까? > int
		//2. nums1의 자료형이 뭡니까? > int[] 
		//3. nums2의 자료형이 뭡니까? > int[][]
		
		//4. nums1[0]의 자료형이 뭡니까? > int
		
		//5. nums2[0][0]의 자료형이 뭡니까? > int
		//6. nums2[0]의 자료형이 뭡니까? > int[]
		
		System.out.println();
		
		//3차원 배열
		// -> 첨자 3개 -> 3중 for문
		for (int i=0; i<nums3.length; i++) { //2
			for (int j=0; j<nums3[0].length; j++) { //3
				for (int k=0; k<nums3[0][0].length; k++) { //4
					System.out.printf("nums[%d][%d][%d]=%d\n"
										, i, j, k, nums3[i][j][k]);
				}
			}
		} //for
		
	}
	
}











