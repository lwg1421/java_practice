package codingtest;

import java.util.Scanner;

public class BOJ11659_구간합구하기4 {

	static int[] numArr;
	static int[][] rangeArr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//수의 개수 N
		int M = sc.nextInt();	//합을 구해야 하는 횟수 M
		
		numArr = new int[N];	//수를 담을 배열 numArr
		int[] sumArr = new int[N+1];
		
		
		/*
		 * numArr의 첫번째 값의 인덱스는 0
		 * sumArr의 첫번째 값의 인덱스는 1
		 */
		
		for (int i = 0; i < N; i++) {	//numArr에 수를 담음
			numArr[i] = sc.nextInt();
			sumArr[i+1] = sumArr[i]+numArr[i];
		}
		
		rangeArr = new int[M][2];	//구간 값을 담을 배열
		for (int i = 0; i < M; i++) {	//각 구간 값 받기
			rangeArr[i][0] = sc.nextInt();
			rangeArr[i][1] = sc.nextInt();
		}
		
		
		for (int i = 0; i < M; i++) {
			int result = sumArr[rangeArr[i][1]] - sumArr[rangeArr[i][0]-1];
			System.out.println(result);
		}
		
		
		
		
	}

}
