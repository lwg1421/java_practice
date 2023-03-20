package codingtest;

import java.util.Scanner;

public class BOJ2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] sumArr = new int[N+1];
		
		int sum = 0;
		for (int i = 0; i <= N; i++) {	//합배열에 값 담기
			sum+=i;
			sumArr[i] = sum;
		}
		
		int start = 0;
		int end = 0;
		int count = 1;
		while(end < N) {
			if(sumArr[end] - sumArr[start] == N) {
				count++;
				start++;
				end++;
			} else if(sumArr[end] - sumArr[start] < N) {
				end++;
			} else start++;
		}
		
		System.out.println(count);
	}

}
