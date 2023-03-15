package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HW1_BOJ10986_이원근 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력 받기
		StringTokenizer st = new StringTokenizer(br.readLine());  //문자열 쪼개기
		int n = Integer.parseInt(st.nextToken()); // N개의 수 입력
		int m = Integer.parseInt(st.nextToken()); // 나누는 수 M
		long sum = 0;  //합 초기화
		long number[] = new long[m]; //개수를 셀 배열 생성
		long count = 0;	//결과값 초기화
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < n+1; i++) {
			sum += Integer.parseInt(st.nextToken());
			sum %= m;
			number[(int)sum]++;
		}
		
		count += number[0];
		for(int i = 0; i < m; i++) {
			count += (number[i]*(number[i]-1))/2;
		}
		
		System.out.println(count);
	}

}
