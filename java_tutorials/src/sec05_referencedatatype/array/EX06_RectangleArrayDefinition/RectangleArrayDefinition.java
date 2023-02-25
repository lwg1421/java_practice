package sec05_referencedatatype.array.EX06_RectangleArrayDefinition;

public class RectangleArrayDefinition {

	public static void main(String[] args) {		
		//#1. 배열의 선언 방법 1
		//자료형 뒤에 괄호 선언
		int[][] array1 = new int[3][4];
		int[][] array2;
		array2 = new int[3][4];
		
		//#2. 배열의 선언 방법 2
		//변수명 뒤에 괄호 선언
		int array3[][] = new int[3][4];
		int array4[][];
		array4 = new int[3][4];
		
		//#3. 배열의 선언 방법 3
		//자료형과 변수명 뒤에 각각 하나씩 괄호 선언
		int[] array5[] = new int[3][4];
		int[] array6[];
		array6 = new int[3][4];
		
		//#4. 다양한 배열 선언 (기본자료형 배열, 참조자료형 배열)
		boolean[][] array7 = new boolean[3][4];
		int[][] array8 = new int[2][4];
		double[][] array9 = new double[3][5];
		String[][] array10 = new String[2][6]; //참조자료형 배열		
	}

}
