package codingtest;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BOJ11660_구간합구하기5 {

	static int N;	//표의 크기
	static int M;	//합을 구해야 하는 횟수
	static int[][] arr;	//일반 배열
	static int[][] sumArr;	//합배열
	static int[][] pointArr;	//좌표값을 담을 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	//표의 크기
		M = sc.nextInt();	//합을 구해야 하는 횟수
		
		
		arr = new int[N+1][N+1];
		sumArr = new int[N+1][N+1];
		pointArr = new int[M][4];
		
		for(int i = 1; i <= N; i++) {	//일반 배열에 값 할당
			for(int j = 1; j <= N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < M; i++) {	//좌표값 할당
			pointArr[i][0] = sc.nextInt(); 
			pointArr[i][1] = sc.nextInt(); 
			pointArr[i][2] = sc.nextInt(); 
			pointArr[i][3] = sc.nextInt(); 
		}
		
		for (int i = 1; i <= N; i++) {	//합배열에 값 할당
			for(int j = 1; j<= N; j++) {
				sumArr[i][j] = sumArr[i-1][j] + sumArr[i][j-1] - sumArr[i-1][j-1] + arr[i][j];
			}
		}
		
//		for (int i = 0; i <= N; i++) {	//합배열 잘 구해졌나 확인.
//			System.out.println(Arrays.toString(sumArr[i]));
//		}
		
		for (int i = 0; i < M; i++) {
			int x1 = pointArr[i][0];
			int x2 = pointArr[i][1];
			int y1 = pointArr[i][2];
			int y2 = pointArr[i][3];
			System.out.println(sumArr[y1][y2]-sumArr[x1-1][y2]-sumArr[y1][x2-1]+sumArr[x1-1][x2-1]);
		}
		
	}

}
