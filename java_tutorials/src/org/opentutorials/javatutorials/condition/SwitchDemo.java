package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		/* 그냥 case문을 작성하게 되면 조건에 일치하는 실행문 이후의 내용이
		 * 모두 실행되게 된다. 따라서 break문을 넣어주게 되면 해당 조건에
		 * 해당하는 내용만 실행이 되고 거기서 break되어 뒤의 내용이 실행되지 않는다.
		 */
		
		/* default문을 넣게되면
		 * 조건에 해당하는 값이 하나도 없을 경우에
		 * 기본값으로 default에 해당하는 내용이 실행되게 된다.
		 * 마지막 예시를 봐 보도록 하자
		 */
		System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
         
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
         
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        }
        
        System.out.println("switch(4)");
        switch(4){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        default :
        	System.out.println("조건에 해당하는 내용이 없어 기본 문장이 출력됩니다.");
        }

	}

}
