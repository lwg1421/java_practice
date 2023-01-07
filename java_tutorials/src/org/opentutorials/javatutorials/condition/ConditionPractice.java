package org.opentutorials.javatutorials.condition;

public class ConditionPractice {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		
		if ((id.equals("egoing"))||(id.equals("lwg1421")) && (pw.equals("1111"))) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

	}

}
