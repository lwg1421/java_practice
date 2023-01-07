package org.opentutorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		System.out.println("짝수만 출력");
		for (int i = 1; i<20; i++) {
			if (i%2==1) {
				continue;
			}
			System.out.println("print"+i);
		}

	}

}
