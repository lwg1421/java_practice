package codingtest;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BOJ2003_수들의합2 {
	
	public static void main(String[] args) {
		int N;
		int M;
		int[] arr;
		int[] arrSum;
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		arrSum = new int[N+1];	//편의상 0부터 만들 것이므로 사이즈 +1
		
		for (int i = 0; i < N; i++) {	//배열에 값을 담는다
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < N; i++) {	//구간합에 값을 담는다.
			sum += arr[i];
			arrSum[i+1]  = sum;
		}
		
		//값이 잘 담겼나 확인
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arrSum));
		
		int count = 0;
		for (int i = 0; i < arrSum.length-1; i++) {
			for (int j = i+1; j < arrSum.length; j++) {
				if(arrSum[j]-arrSum[i] == M) count++;
			}
		}
		
		System.out.println(count);
		
		
	}
	
}
