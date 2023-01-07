package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		/* equals는 문자열을 비교할 때 사용하는 메소드다. 
		 * 우리는 아직 메소드를 배우지 않았기 때문에 지금은 그냥 이것을 연산자로 이해해도 무방하다. 
		 * 아래는 문자와 문자를 비교하는 방법이다.
		 */
		String a = "Hello world";
		String b = new String("Hello world");
		System.out.println(a == b);
		
		// 문자열을 비교할 때에는 ==으로 비교하는 것이 아니라
		// .equals()로 비교해주어야 함
		System.out.println(a.equals(b));

	}

}
