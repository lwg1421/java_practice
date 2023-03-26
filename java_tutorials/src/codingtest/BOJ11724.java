package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BOJ11724 {
	static int N,M;	//정점 개수, 간선 개수
	static ArrayList<Integer>[] adjArr;	//노드별 인접노드를 담을 배열
	static boolean[] visited;	//노드별 방문 여부 체크

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	//정점 개수
		M = sc.nextInt();	//간선 개수
		
		adjArr = new ArrayList[N+1];	//편의상 0번 노드도 만들 것이므로 사이즈+1
		visited = new boolean[N+1];
		
		for(int i = 0; i<=N; i++) {
			adjArr[i] = new ArrayList();
		}
		
		for(int i = 0; i <M; i++) {	//간선 개수만큼 입력받음
			int firstNode = sc.nextInt();
			int secondNode = sc.nextInt();
			adjArr[firstNode].add(secondNode);	//각 노드 자리에 연결노드를 담음
			adjArr[secondNode].add(firstNode);
		}
		
		//노드별로 인접노드가 잘 담겼는지 확인
//		System.out.println(Arrays.toString(adjArr));
		
		//깊이 우선탐색 실시
		int count = 0;
		for (int i = 1; i <= N; i++) {
			if(!visited[i]) {
				DFS(i);
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	private static void DFS(int x) {
		visited[x] = true;	//방문한 노드는 true로 변경
		
		for(int node : adjArr[x]) {
			if (!visited[node]) {
				DFS(node);
			}
		}
	}

}
