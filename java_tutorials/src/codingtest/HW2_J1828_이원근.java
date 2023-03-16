package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HW2_J1828_이원근 {

	static int[][] arr;	//물질 담을 배열 선언
	static int N;//물질 개수 변수 선언
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();	//물질의 수 N
		arr = new int[N][2];	//물질 담을 배열 크기 지정
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();	//화학물질별 최저온도 값 배열에 담음
			arr[i][1] = sc.nextInt();	//화학물질별 최고온도 값 배열에 담음
		}
		
		
		//2차원 배열 낮은 온도 기준 오름차순 정렬 하기 : 람다 사용
		//오름차순 정렬을 해주면 이후에 조건문에서 살필 조건이 대폭 줄어듦
		Arrays.sort(arr,(o1,o2) ->{
			return o1[0]-o2[0];
		});

		
		int count = 1;	//필요한 냉장고 개수 : count
		
		int min = arr[0][0];	//냉장고 최저온도 초기값 설정
		int max = arr[0][1];	//냉장고 최고온도 초기값 설정
		
		for (int i = 1; i < N; i++) {
			//만약 이전의 max값이 현재 배열 사이에 있다면 냉장고 +0 //min max경계값만 새로 변경
			if ((max >= arr[i][0]) && (max <= arr[i][1])) {
				min = (min > arr[i][0]) ? min:arr[i][0];
				max = (max < arr[i][1]) ? max:arr[i][1];
			} else if (max	> arr[i][1]) {	//만약 max값이 현재의 배열의 max보다 크다면 max값을 현재의 max값으로 수정 : 범위를 좁히기 위함.
				max = arr[i][1];
			} else {	//만약 이전의 max값이 현재 배열 사이에 없다면 냉장고 +1
				min = arr[i][0];
				max = arr[i][1];
				count++;
			}
			
		}
		
		System.out.println(count);

	}

}