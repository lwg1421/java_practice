package codingtest;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1546_평균 {
	
	static int[] score; //과목 점수를 담을 배열 score
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //시험 본 과목의 수 N
		score = new int[N];	//과목 점수를 담을 배열 생성
		
		for (int i = 0; i < N; i++) {	//과목별 시험 점수 입력 받기
			score[i] = sc.nextInt();
		}
		
		Arrays.sort(score);	//점수를 담은 배열을 오름차순 정렬
		int M = score[N-1];	//점수 중 최대값 M
		
		double sum = 0; //변환한 점수들의 합계	//출력형식이 소수점까지이므로 double로 선언
		for (int i = 0; i < N; i++) {
			sum += (score[i]*100.0/M);	//int끼리 나누게되면 정수값이 되므로 double형으로 만들기 위해 100.0으로 나눠줌
		}
		
		System.out.println(sum/N);
		
	}

}
