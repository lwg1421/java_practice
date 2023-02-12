package sec04_controlstatement.selectcontrolstatement.EX01_IfControlStatement;

public class IfControlStatement {

	public static void main(String[] args) {
		// 유형1 : if
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("실행1");
		}
		if (value1 < 5) {
			System.out.println("실행2");
		}
		
		
		// 유형2 : if - else
		int value2 = 5;
		if (value2 > 3) {
			System.out.println("실행5");
		} else {
			System.out.println("실행6");
		}
		
		// 유형2 : if - else문은 삼항연산자와 변환이 가능
		System.out.println((value2>3) ? "실행5":"실행6"); 

		
		// 유형3 : if --  else if --  else
		int value3 = 85;
		if (value3 >= 90) {
			System.out.println("A학점");
		} else if (value3 >= 80) {
			System.out.println("B학점");  // 실행한 후 if문 탈출!!
		} else if (value3 >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("D학점");
		}
	}

}
