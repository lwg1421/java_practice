package codingtest;

import java.util.Scanner;

public class JO588_재귀함수 {
	
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		down();
		
	}
	
	private static void down() {
		if (N>0) {
			System.out.print(N + " ");
			N--;
			down();
		}
	}
}
