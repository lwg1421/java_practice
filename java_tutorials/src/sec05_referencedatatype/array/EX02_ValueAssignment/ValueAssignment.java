package sec05_referencedatatype.array.EX02_ValueAssignment;

public class ValueAssignment {

	public static void main(String[] args) {
		// 배열의 값 대입 방법 1
		int[] array1 = new int[3];  // 3개 값을 담을 수 있는 크기의 정수형 배열 생성
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		
		// 배열의 값 대입 방법2
		int[] array2 = new int[] {3,4,5};
		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
		
		
		// 배열의 값 대입 방법3
		int[] array3 = {3,4,5};
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);
	}
}
