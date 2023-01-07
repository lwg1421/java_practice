package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int i = sc.nextInt()*1000;
			System.out.println(i);
		}
		sc.close();

	}

}
