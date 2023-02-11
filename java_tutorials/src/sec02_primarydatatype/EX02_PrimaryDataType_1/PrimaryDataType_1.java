package sec02_primarydatatype.EX02_PrimaryDataType_1;

public class PrimaryDataType_1 {

	public static void main(String[] args) {
		// boolean : true / false
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		// 정수(byte, short, int, long): 음의 정수/ 0 / 양의 정수
		byte value1 = 10;
		short value2 = -10; 
		int value3 = 100;
		long value4 = -100L;  // long 자료형으로 인식
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		// 실수(float, double) : 음의 실수 / 0 / 양의 실수
		float value5 = 1.2F; // float 자료형으로 인식
		double value6 = -1.5;
		double value7 = 5;  // 자동 타입 변환
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);  // 실수값으로 출력

		
		// 문자로 저장한느 방법
		char char1 = 'A';
		char char2 = '가';
		char char3 = '3'; // 숫자 3이 아닌 문자 3을 의미함
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
	}

}
