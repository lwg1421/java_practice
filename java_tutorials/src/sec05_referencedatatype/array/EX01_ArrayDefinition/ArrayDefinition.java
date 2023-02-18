package sec05_referencedatatype.array.EX01_ArrayDefinition;

import java.util.Arrays;

public class ArrayDefinition {

	public static void main(String[] args) {
		// 배열의 선언 방법1
		int[] array1 = new int[3];
		System.out.println(array1[2]);
		System.out.println(Arrays.toString(array1));

		int[][] array2 = new int[2][3];
		array2[0][0] = 90;
		array2[1][2] = 77;
		System.out.println(Arrays.toString(array2[1]));
		
		int[][] a = {{1,2},{3,4,5}};
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println(args[0]);
	}

}
