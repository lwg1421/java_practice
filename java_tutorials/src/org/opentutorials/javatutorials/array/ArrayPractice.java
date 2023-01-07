package org.opentutorials.javatutorials.array;

public class ArrayPractice {
	public static void members() {
		String[] classmembers = {"이원근", "오성범", "하재민"};
		int[] classscore = {10,20,30};
		for (int i=0; i<classmembers.length; i++) {
			System.out.println(classmembers[i]+"의 숫자는"+classscore[i]+"입니다.");
		}
	}

	public static void main(String[] args) {
		members();

	}

}
