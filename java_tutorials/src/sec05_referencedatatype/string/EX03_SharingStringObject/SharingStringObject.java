package sec05_referencedatatype.string.EX03_SharingStringObject;

public class SharingStringObject {

	public static void main(String[] args) {
		//#1. 문자열 객체 공유 (리터럴로 객체를 생성한 경우) new 키워드로 객체 생성한 경우 (별도의 객체 생성) 공유X
		// new로 생성할 때는 동일한 문자열 객체가 힙 메모리에 있든, 없든 무조건 새롭게 객체를 생성한다.
		// 문자열 리터럴로 생성할 때는 힙 메모리에 리터럴로 생성된 동일 문자열을 포함하고 있는 객체가 있으면 그 객체를 공유한다.
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");
		
		//@stack 메모리 값 비고 (==)
		System.out.println(str1==str2); //false
		System.out.println(str2==str3); //true
		System.out.println(str3==str4); //false
		System.out.println(str4==str1); //false

	}

}
