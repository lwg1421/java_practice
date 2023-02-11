package sec01_oprator_1.EX04_ConditionalOperator;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 삼항 연산자
		int value1 = (3 > 5) ? 6 : 9;  //3>5는 false이므로 value1은 9가 된다.
		System.out.println(value1);
		
		int value2 = (5 > 3) ? 10 : 20; //5>3은 true이므로 value2의 값은 10이 된다.
		
		int value3 = 3;
		System.out.println((value3 %2 ==0) ? "짝수" : "홀수"); 
		//value3(3)을 2로 나눈 나머지는 0이 아니므로 false이기때문에 "홀수"가 출력된다.
	}

}
