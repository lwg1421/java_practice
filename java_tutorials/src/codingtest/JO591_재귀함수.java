package codingtest;

import java.util.Scanner;

public class JO591_재귀함수 {
	
	private static int calculator(int num) {
		if(num == 1) {
			return 1;
		} else {
			return calculator(num/2) + calculator(num-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(calculator(N));
	}

}
