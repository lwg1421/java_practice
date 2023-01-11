# 조건문
>> 조건문이란 주어진 조건에 따라서 애플리케이션을 다르게 동작하도록 하는 것으로 프로그래밍의 핵심 중의 하나라고 할 수 있다.

### if
- if (<b>조건) {<b>조건이 참일 경우 실행할 내용}
- 소괄호 안에 조건을 작성해주고
- 대괄호안에 조건이 참일 경우 실행할 내용을 작성한다.

### else
- if만으로는 좀 더 복잡한 상황을 처리하는데 부족하다. 
- if-else절은 if 절의 값이 true일 때 then절이 실행되고, false일 때 else절이 실행된다.
- else절은 조건문의 가장 마지막에 작성해야 한다.
- else절은 생략이 가능하다.


### else if
- else if절을 이용하면 조건문의 흐름을 좀 더 자유롭게 제어할 수 있다. 
- if절의 값이 true라면 then절이 실행된다. 
- false라면 else if절로 제어가 넘어간다. 
- else if절의 값이 true라면 else if then절이 실행된다. 
- false라면 else 절이 실행된다. 
- else if절은 여러 개가 복수로 등장할 수 있고, else절은 생략이 가능하다. 
- else 절이 else if 절보다 먼저 등장할 수는 없다.


### 변수와 비교연산자 그리고 조건문
```
// LoginDemo 클래스
public class LoginDemo {
    public static void main(String[] args) {
    // id 변수에 첫번째 입력값 대입
        String id = args[0];
        // 입력받은 아이디가 wonkeun이라면 if절을 실행하여 right를 출력
        if(id.equals("wonkeun")){
            System.out.println("right");
        // 입력받은 아이디가 wonkeun이 아니라면 else절을 실행하여 wrong을 출력
        } else {
            System.out.println("wrong");
        }
    }
}
```


### 조건문의 중첩
- 조건문을 중첩하여 사용할 수 있다.
- 예시
```
// LoginDemo2 클래스
public class LoginDemo2 {
    public static void main(String[] args) {
    // id 변수에 첫번째 입력값 대입
    // password 변수에 두번째 입력값 대입
        String id = args[0];
        String password = args[1];
        // id가 wonkeun이라면 if절 실행
        if (id.equals("wonkeun")) {
            // password가 111111이면 if절을 실행하여 right 출력
            if (password.equals("111111")) {
                System.out.println("right");
            // password가 111111이 아니면 else절을 실행하여 wrong 출력
            } else {
                System.out.println("wrong");
            }
        // id가 wonkeun이 아니라면 else절 실행하여 wrong 출력
        } else {
            System.out.println("wrong");
        }
    }
}
```



### switch문
- 조건문의 대표적인 문법은 if문이다. 
- 사용빈도는 적지만 조건이 많다면 switch문이 로직을 보다 명료하게 보여줄 수 있다.
- 입력값이 정형화되어 있는 경우 if문보다는 switch/case 문을 쓰는것이 가독성에서 좀 더 유리하다.
- if문과 switch문은 서로 대체 가능한 관계
- 사용 예시
```
switch(입력변수) {
    case 입력값1: ...
         break;
    case 입력값2: ...
         break;
    ...
    default: ...
         break;
}
```

### default
- switch문 안에서 사용된다.
- 작성한 case들 중 해당하는 내용이 없을 경우 dafault가 실행된다.
- else문과 비슷한 느낌인듯(?)

### break
- break를 만나면 실행이 즉시 중단된다.



