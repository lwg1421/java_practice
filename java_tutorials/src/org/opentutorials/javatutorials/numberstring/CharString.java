package org.opentutorials.javatutorials.numberstring;

public class CharString {

	public static void main(String[] args) {
		// 문자열(두글자이상)은 큰따옴표 ""로 묶어줘야함
		System.out.println("hello");
		
		// 문자(한글자)는 작은따옴표 ''로도 표현 가능
		System.out.println('H');
		System.out.println("E");
		
		// 문자열 안에 큰따옴표를 넣고싶다면?
		// 역슬래시 \ 를 따옴표 앞에 넣어주면 됨
		System.out.println("He said \"Hello\"for me");
		
		// 문자열 안에서 줄바꿈을 하고싶다면?
		// 역슬래시 뒤에 n을 작성하면 됨 \n
		System.out.println("She said \n\"Perfect\"\n for me.");
		 
		

	}

}
