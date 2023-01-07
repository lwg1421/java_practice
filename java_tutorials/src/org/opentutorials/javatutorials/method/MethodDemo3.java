package org.opentutorials.javatutorials.method;

public class MethodDemo3 {
	public static void numberingwhile() {
		System.out.println("while");
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void numberingfor() {
		System.out.println("for");
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		numberingwhile();
		numberingfor();

	}

}
