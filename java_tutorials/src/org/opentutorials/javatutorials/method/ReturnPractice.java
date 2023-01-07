package org.opentutorials.javatutorials.method;

public class ReturnPractice {
	// 부르는 출석번호에 해당하는 학생의 이름과 점수 출력
	public static String members(int number){
		String[] Students = {"가","나","다","라","마","바","사"};
		int[] Scores = {13,45,2,3,45,2,4};
		
		String result = Students[number-1]+"의 점수는"+ Scores[number-1]+"점입니다.";
		return result;
		
	}

	public static void main(String[] args) {
		String final_result = members(2);
		System.out.println(final_result);

	}

}
