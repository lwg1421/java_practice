package sec04_controlstatement.selectcontrolstatement.EX02_SwitchControlStatement;

public class SwitchControlStatement {

	public static void main(String[] args) {
		// break가 포함되지 않았을 떄
		System.out.println("break문이 없을 경우");
		int value1 = 2;
		switch(value1) {
		case 1 :
			System.out.println("A");
		case 2 :
			System.out.println("B"); //case2의 위치로 온 후 멈추는 것이 아니라 다음 구문을 계속 실행
		case 3 :
			System.out.println("C");
		default :
			System.out.println("D");
		}

		
		// break가 포함되어 있을 때
		System.out.println("break문이 있을 경우");
		int value2 = 2;
		switch(value2) {
		case 1 :
			System.out.println("A");
			break;
		case 2 :
			System.out.println("B"); //case2의 위치로 온 후 break문을 만나 switch문을 탈출
			break;
		case 3 :
			System.out.println("C");
			break;
		default :
			System.out.println("D");
			break;
		}
	}

}
