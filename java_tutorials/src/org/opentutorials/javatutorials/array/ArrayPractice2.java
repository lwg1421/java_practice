package org.opentutorials.javatutorials.array;

public class ArrayPractice2 {

	public static void main(String[] args) {
		String[] ClassStudent = new String[3];
		ClassStudent[1] = "이원근";
		System.out.println("이원근추가");
		System.out.println(ClassStudent[0]);
		System.out.println(ClassStudent[1]);
		System.out.println(ClassStudent[2]);
		
		ClassStudent[0] = "오성범";
		System.out.println("오성범추가");
		System.out.println(ClassStudent[0]);
		System.out.println(ClassStudent[1]);
		System.out.println(ClassStudent[2]);
		
		ClassStudent[2] = "하재민";
		System.out.println("하재민추가");
		System.out.println(ClassStudent[0]);
		System.out.println(ClassStudent[1]);
		System.out.println(ClassStudent[2]);
		
		
	}

}
