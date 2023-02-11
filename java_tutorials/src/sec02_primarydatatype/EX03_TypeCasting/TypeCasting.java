package sec02_primarydatatype.EX03_TypeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		// 캐스팅 방법 1 : 자료형
		int value1 = (int)5.3;   // 값이 5.3 -> 5로 변경됨
		long value2 = (long)10;
		float value3 = (float)5.8;
		double value4 = (double)16;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		
		// 캐스팅 방법 2 : L, F
		long value5 = 10L;
		long value6 = 10l;
		float value7 = 5.8F;
		float value8 = 5.8f;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
		
		// 자동 타입 변환
		float data1 = 3;   // int -> float 업캐스팅
		long data2 = 5;    // int -> long 업캐스팅
		double data3 = 7;  // int -> double 업캐스팅
		byte data4 = 9;    // int -> byte
		short data5 = 11;  // int -> short
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		System.out.println(data5);
		
		
		// 수동 타입 변환
		byte data6 = (byte)128;    // int -> byte 다운캐스팅
		int data7 = (int)3.5;      // double -> int 다운캐스팅
		float data8 = (float)7.5;  // double -> float 다운캐스팅
		
		System.out.println(data6);
		System.out.println(data7);
		System.out.println(data8);
		

	}

}
