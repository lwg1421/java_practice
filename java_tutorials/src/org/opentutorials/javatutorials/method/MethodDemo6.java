package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
	// void는 반환값이 아무것도 없음을 의미
	// String으로 작성하게 되면 반환값의 형태가 String형임을 의미
	// 이런식임!!
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i<=limit) {
			output = output+i+" ";
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		String result = numbering(3,8);
		System.out.println(result);

	}

}
