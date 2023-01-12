# 입력과 출력
>> 메소드에서의 입력과 출력에 대해서 알아봤다. 이를 통해서 메소드가 좀 더 쓸모 있는 것이 될 수 있다는 것도 알게 되었다. 
>> 메소드와 마찬가지로 자바 에플리케이션도 입력과 출력을 할 수 있다. 예를들어 사용자의 키보드, 마우스, 터치를 입력으로 받아들일 수 있고, 그에 따른 처리 결과를 모니터나 스피커등으로 출력 할 수 있다. 입력 값이 없는 에플리케이션은 입력 값이 없는 메소드처럼 똑같은 결과를 반복하는 것에 불과하다. 

### String[] args
```
class InputDemo{
    public static void main(String[] args){
        System.out.println(args.length);
    }
}
```
- main 메소드는 자바에서 특별한 의미를 가진 메소드다. 
- main 메소드의 내용을 구현하면 자바 에플리케이션을 실행할 때 main 메소드가 호출되면서 프로그램이 구동하게 되는 것이다.
- 이 때 Strings[] args는 입력 값의 파라미터로 동작한다.
- String[] args은 매개변수다. 
- 매개변수는 메소드가 호출될 때 전달된 입력 값을 메소드 내부로 전달하는 역할을 하는 변수다. 
- 이 변수의 데이터형은 String[]인데, String[]은 문자열을 담고 있는 배열이다. 
- 자바 에플리케이션에서는 메소드 main의 인자 String[] args를 통해서 사용자가 입력한 값을 전달하고 있다
- args.length는 배열의 길이를 의미한다.

### Scanner
- Scanner를 import 해주어야한다.
  - import java.util.Scanner;
- 인스턴스를 생성하여 사용한다.
  - Scanner sc = new Scanner(System.in);
- String형에서 nextLine() 같은 경우 첫번째로 입력받지 않는 경우 입력이 불가능한 현상이 있는데 이를 해결하기 위해서는 입력받기 전에 sc.nextLine() 을 한번 그냥 더 작성해주면 첫번째로 입력받는 것이 아니더라도 입력이 가능하다.
- 자료형에 따라 값 입력받는 법
```
in.nextByte()		// byte 형 입력 및 리턴
in.nextShort()		// short 형 입력 및 리턴
in.nextInt()		// int 형 입력 및 리턴
in.nextLong()		// long 형 입력 및 리턴
 
in.nextFloat()		// float 형 입력 및 리턴
in.nextDouble()		// double 형 입력 및 리턴
 
in.nextBoolean()	// boolean 형 입력 및 리턴
 
in.next()			// String 형 입력 및 리턴	(공백을 기준으로 한 단어를 읽음)
in.nextLine()		// String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)
```
  
