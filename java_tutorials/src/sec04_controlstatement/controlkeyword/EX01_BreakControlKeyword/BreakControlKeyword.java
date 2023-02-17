package sec04_controlstatement.controlkeyword.EX01_BreakControlKeyword;

public class BreakControlKeyword {

	public static void main(String[] args) {
		
		// 단일 반복문 탈출
		System.out.println("단일 반복문 탈출");
		for (int i = 0; i<10; i++) {
			System.out.println(i);
			break;
		}
		
		// 다중 반복문 탈출
		System.out.println("다중 반복문 탈출");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j==2) {
					break;
				}
				System.out.println(i+","+j);
			}
		}
		
		// break + Label문으로 다중 반복문 탈출
		System.out.println("break + Label문으로 다중 반복문 탈출");
		
		POS1 :for (int i = 0; i < 5; i++) {   // 레이블 위치 지정(break하고자 하는 반복문 앞에 레이블 표기
			 for (int j = 0; j < 5; j++) {
				if (j==2) {
					break POS1;				   // out 레이블이 달린 반복문 탈출
				}
				System.out.println(i+","+j);
			}
		}

	}

}
