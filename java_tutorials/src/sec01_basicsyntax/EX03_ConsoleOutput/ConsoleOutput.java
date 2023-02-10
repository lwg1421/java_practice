package sec01_basicsyntax.EX03_ConsoleOutput;

public class ConsoleOutput {

	public static void main(String[] args) {
		System.out.println("안녕하세용");
		System.out.println("안녕"+"하세용");
		// 1이 바로 문자열에 추가됨
		System.out.println(1+"안녕하세용");
		// 더하기가 먼저 시행되고 문자열로 변환됨
		System.out.println(1+4+"안녕하세용");
		
		System.out.print("한줄로");
		System.out.print("붙어서");
		System.out.print("출력됨");
		// 한줄 띄어주기
		System.out.print("\n");
		System.out.printf("%d와 %.2f가 출력됩니다~", 5, 6.7997);
	}

}
