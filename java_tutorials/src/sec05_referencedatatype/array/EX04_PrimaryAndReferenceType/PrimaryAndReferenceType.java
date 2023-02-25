package sec05_referencedatatype.array.EX04_PrimaryAndReferenceType;

public class PrimaryAndReferenceType {
	public static void main(String[] args) {		
		//#1. 기본자료형의 대입연산 (stack 값 복사)
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		System.out.println(value1); //3
		System.out.println(value2); //7
		System.out.println();
		
		//#2. 참조자료형의 대입연산 (stack 값 복사)
		// 참조 자료형은 스택에는 실제 메모리의 힙 위치만 저장하고
		// 힙에 실제 값을 저장한다.
		// 따라서 복제하여 수정하면 기존 값도 같이 바뀌게 된다(위치값이 같으므로)
		int[] array1 = new int[] {3, 4, 5};
		int[] array2 = array1;
		array2[0]=7;
		System.out.println(array1[0]); //7
		System.out.println(array2[0]); //7		
	}

}
