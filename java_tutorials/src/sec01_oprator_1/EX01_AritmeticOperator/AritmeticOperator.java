package sec01_oprator_1.EX01_AritmeticOperator;

public class AritmeticOperator {

	public static void main(String[] args) {
		// 산술 연산자
		System.out.println(2+3);
		System.out.println(7/2); //같은 자료형 끼리의 연산결과는 해당 자료형. // int/int = int
		
		// 증감 연산자 @case1
		// 전위와 후위가 차이가 없는 경우
		int value1 = 3;
		value1++;  //후위형 : 우선순위가 마지막
		System.out.println(value1);
		
		int value2 = 3;
		++value2;  //전위형 : 우선순위가 1등
		System.out.println();
		
		// 증감 연산자 @case2
		// 전위와 후위가 차이가 있는 경우
		int value3 = 3;
		int value4 = value3++;
		System.out.println(value3);  //4
		System.out.println(value4);  //3
		
		int value5 = 3;
		int value6 = ++value5;
		System.out.println(value5);  //4
		System.out.println(value6);  //4

		// 증감 연산자 @case3
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;
		System.out.println(value7);  //2
		System.out.println(value8);  //5
		System.out.println(value9);  //10
	}

}
