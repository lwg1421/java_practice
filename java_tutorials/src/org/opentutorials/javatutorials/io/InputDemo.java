package org.opentutorials.javatutorials.io;

import java.util.*;

public class InputDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력하세요 : ");
		String sex = sc.nextLine();
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		
		System.out.print("나이를 입력하세요 : ");
		int i = sc.nextInt();
		
		System.out.println(name+"님! 당신은 "+sex+"이고 "+i+"살입니다.");
		
		sc.close();

	}

}
