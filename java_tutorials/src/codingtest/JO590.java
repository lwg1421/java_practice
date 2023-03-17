package codingtest;

import java.util.Scanner;

public class JO590 {
	
	private static int pibonacci(int num) {
		if (num == 1) {
			return 1;
		} else if (num == 2) {
			return 1;
		} else {
			return pibonacci(num-1) + pibonacci(num-2);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(n+"의 피보나치 수열 값 : "+ pibonacci(n));
	}

}
