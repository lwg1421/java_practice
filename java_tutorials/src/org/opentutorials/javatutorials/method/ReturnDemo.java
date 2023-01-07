package org.opentutorials.javatutorials.method;
//학생명단이 배열로 주어져있음
//인자값을 두개 받아서 해당 위치 사이에 있는 학생이름을 출력해보자
public class ReturnDemo {
	public static String SelectMembers(int start, int finish){
		String[] members = {"영","일","이","삼","사","오","육","칠","팔","구","십"};
		String SelectM = "";
		int i = start;
		while(i<=finish) {
			SelectM = SelectM + members[i]+" ";
			i++;
		}
		return SelectM;
	}

	public static void main(String[] args) {
		String result = SelectMembers(2,6);
		System.out.println(result);

	}

}
