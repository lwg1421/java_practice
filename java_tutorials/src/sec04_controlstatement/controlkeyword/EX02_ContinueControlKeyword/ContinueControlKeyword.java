package sec04_controlstatement.controlkeyword.EX02_ContinueControlKeyword;

/*continue 제어키워드*/

public class ContinueControlKeyword {
	public static void main(String[] args) {		
		//#1. 단일 루프에서의 continue
		for(int i=0; i<10; i++) {
			continue;
			//System.out.print(i+ " ");
		}
		
		for(int i=0; i<10; i++) {			
			System.out.print(i+ " ");
			continue;
		} //0~9
		System.out.println();
		
		for(int i=0; i<10; i++) {	
			if(i==5) {
				continue;
			}
			System.out.print(i+ " ");			
		} //0~4, 6~9
		System.out.println();			
		
		//#2. 다중(이중 루프에서의 continue)
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					continue;
				}
				System.out.println(i+ ", "+j);
			}
		} 
		//
		System.out.println("continue + Lable로 다중 반복문 continue");
		POS1: for(int i=0; i<5; i++) {		// continue하고자 하는 반복문 앞에 레이블 표기
			for(int j=0; j<5; j++) {
				if(j==3) {
					continue POS1;			// POS1 레이블이 달린 반복문의 닫힌 중괄호 대체
				}
				System.out.println(i+ ", "+j);
			}
		} //
	}
}
