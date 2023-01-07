package org.opentutorials.javatutorials.array;

public class DefineDemo {

	public static void main(String[] args) {
		// 배열을 정의하는 방법
		/* String 뒤에 []를 적어줌으로서 classGroup이라는 변수가
		 * 배열임을 의미함.
		 * []이 배열이라는 것을 명시적으로 지정해주는 것인데
		 * [] 앞에 String을 적어주었으므로 배열 안에 담기는 변수들이
		 * 문자형이라는 것을 의미함. 
		 */
		String[] classGroup = {"최진혁", "최유빈", "이원근", "오성범"};
		int[] classScore = {50, 60, 100, 100};
		
		for (int i = 0; i<classGroup.length; i++) {
			System.out.println(classGroup[i]+"의 점수는"+classScore[i]+"입니다.");
		}
		
	}

}
 