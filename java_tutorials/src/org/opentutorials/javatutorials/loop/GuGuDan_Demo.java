package org.opentutorials.javatutorials.loop;

public class GuGuDan_Demo {

	public static void main(String[] args) {
		System.out.println("구구단을 외자");
		for (int i =1; i<=9;i++) {
			System.out.println("구구단"+i+"단");
			for (int j=1; j<=9;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
		}

	}

}
