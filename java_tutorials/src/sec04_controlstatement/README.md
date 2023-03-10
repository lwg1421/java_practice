# 제어문과 제어 키워드

## 제어문
>> 프로그램은 기본적으로 소스코드를 위에서부터 차례대로 한줄씩 처리한다.<br>
>> 프로그램을 작성하다보면 이런 처리 순서를 의도적으로 바꿔야 할 때가 있는데 이 역할을 수행하는 것이 바로 '제어문'이다.
### 제어문의 개념
>> 제어문은 '프로그램의 처리 순서를 바꾸는 것'이다.<br>
>> 자바에는 두개의 선택 제어문(if, switch)과 세개의 반복 제어문(for, while, do-while)으로 구성된 다섯개의 제어문이 있다.<br>
>> 그리고 두개의 제어키워드(break, continue가 있다.
### if 선택 제어문
>> if 문은 조건식에 따라 실행 여부를 결정하는 선택 제어문이다.<br>
>> 기본적인 문법 구조는 크게 세가지 유형으로 나뉜다.

### 변수의 범위 표현
>> 변수값의 범위를 지정할 때 수학식에서는 70 <= a <=80 과 같이 표현할 수 있지만,<br>
>> 자바에서는 반드시 각각을 분리하고, **논리연산자**로 연결해줘야 한다.<br>
>> 즉, <b>70 <= a && a <=80</b> 으로 표현해주어야한다.
#### 유형1 : if 단일 구문
- 조건식 1개, 중괄호 1개가 있는 구조
- '조건식 = true' 일 때 중괄호 안을 실행한다.
- '조건식 = false' 일 때 중괄호 안을 실행하지 않는다.
- if문 중 가장 간단한 형태.
- 단순히 조건식의 참 겨짓 여부에 따라 중괄호 안의 실행 여부를 결정하므로 매우 직관적이다.
```
if(조건식) {    // 조건식에는 boolean타입(true,false)만 가능
  실행 구문     // 실행구문은 조건식이 true일 때만 실행됨
}
```
#### 유형2 : if - else 구문
- 조건식 하나와 중괄호 2개가 있는 형태.
- if 구문의 조건식이 true일 때 if 구문의 중괄호가 실행된다.
- false일 때는 else 구문의 중괄호가 실행된다.
- 모든 조건식은 true 아니면 flase 이므로 둘 중 하나는 무조건 실행되며, 둘중 하나만 실행된다.
```
if(조건식) {   
  실행구문    // 조건식이 true일 때만 실행
} else {
  실행구문    // 조건식이 false일 경우 실행
}
```
#### 유형3 : if - else if - else구문
- N개의 조건식과 N+1개의 중괄호를 포함하고 있는 형태.
- else if 구문은 개수에 상관없이 추가할 수 있다.
- 주의할 점은 조건식을 검색할 때 항상 위에서부터 검사를 수행하며 처음으로 조건식이 true가 나오는 중괄호 블록을 만나면 해당 블록의 중괄호를 실행하고 if 문을 탈출한다.
- 즉 중괄호가 100개가 있다고 하더라도 처음으로 참이 되는 블록 하나만 실행된다.
- 따라서 다수의 조건식이 참이 나올 수 있는 경우에는 순서에 유의해 작성해야 한다.
```
if (조건식) {
  실행구문
} else if (조건식) {
  실행구문
} else {
  실행구문
}
```
### switch 선택 제어문
>> switch문은 점프 위치 변숫값에 따라 특정 위치(case)로 이동해 구문을 실행하는 선택 제어문이다.<br>
>> 점프할 수 있는 위치는 'case 위칫값:'으로 설정한다.<br>
>> 이렇게 콜론이 붙은 값은 이동할 위치를 가리키는 일종의 팻말 역할을 한다.<br>
>> 'default:' 구문은 if문의 else 구문과 비슷한 기능으로 일치하는 위칫값이 없을 때 점프할 위치를 나타낸다.(default 구문은 생략 가능)
- switch문의 역할은 특정 위치로 이동시키는 것이 전부다.
- 일치하는 위칫값으로 이동한 후 그 다음 모든 코드를 한줄씩 실행한다.
- if문처럼 단 하나의 실행문만 실행하기 위해서는 break문을 사용해야 한다.
- switch문의 구조
```
switch (점프 위치 변수) {   //점프 위치 변수에는 정수, 문자, 문자열 사용 가능
case 위칫값1 :              // 점프 위치 변수 = 위칫값1 이면 이 위치로 이동
  실행구문;
case 위칫값2 :              // 점프 위치 변수 = 위칫값2 이면 이 위치로 이동
  실행구문;
  
  ...
  
case 위칫값N :              // 점프 위치 변수 = 위칫값N 이면 이 위치로 이동
  실행구문; 
default :                   // 일치하는 위칫값이 없을 때 이 위치로 이동
  실행구문;
}
```
### for 반복 제어문
>> for문은 실행 구문을 반복적으로 수행하는 반복 제어문으로, 일반적으로 반복 횟수가 정해질 때 주로 사용한다.
- for문의 구성
```
for (초기식; 조건식; 증감식){
  실행 구문           // 조건식이 true인 동안 실행
}
```
  - 초기식
    - for문이 시작될 때 딱 한번 실행되고 다시는 실행되지 않는다.
    - 따라서 for문 안에서만 사용할 변수는 주로 초기식에서 초기화한다.
  - 조건식
    - 실행 구문으로 들어가기 위한 유일한 출입구.
    - 이 조건식의 결과가 true가 나오는 동안은 실행 구문을 계속 반복한다.
    - 이 조건식의 결과가 false가 나오면 더 이상 반복을 수행하지 않고 for문을 빠져나간다. 
  - 증감식    
    - for 문의 실행 구문이 모두 수행된 후 닫힌 중괄호(**}**)를 만나면 다음 번 반복을 위해 다시 이동하는 위치이다.
    - 매회 반복을 수행할 때 마다 호출된다.    
- 초기식에 포함된 변수의 선언 위치
  - for문 외부에서 변수 선언
    - for문이 종료된 이후에도 변수는 사라지지 않는다. 
  ```
  int i;
  for (i=0; i<3; i++){
    system.out.println("실행")
  }
  system.out.println("i")    // 3출력
  ```
  - for문 내부에서 변수 선언
    - for문 내부에서만 사용할 수 있다.
    - 초기식 내부에서 변수를 선언하는 이 방식이 주로 사용된다. 
  ```
  for (int i=0; i<3; i++){
    system.out.println("실행")
  }
  system.out.println("i")    // 오류(변수 이미 사라짐)
  ```
  - 여러개의 변수 선언
    - 초기식과 증감식은 쉼표(,)로 구분해 여러 개를 동시에 표기할 수 있다. 
  ```
  for (int i=0, j = 0; (i + j) < 10; i++, j++){
    // ...
  }
  ```
  - 컴파일러는 for문의 소괄호 안에 두개의 세미콜론(;)이 있는지만 문법적으로 검사한다.
  - 따라서 초기식, 조건식, 증감식을 생략하더라도 세미콜론(;)만 두개 있으면 문법적으로 오류는 발생하지 않는다.
  - 따라서 조건식을 생략하게 되면 구문을 끊임없이 반복하는 무한 루프가 된다.
### while 반복 제어문
>> while문도 중괄호 안의 실행 구문을 반복적으로 실행하는 반복 제어문으로 소괄호 안의 조건식이 true인 동안 반복은 지속된다.
- while문의 구성
```
초기식;       // 필수는 아니지만 대부분 사용
while (조건) {// 조건식은 while문 안으로 들어가는 유일한 입구로 생략이 불가능
  실행 구문;  // 조건식이 true인 동안 실행
  증감식;     // 필수는 아니지만 대부분 사용
}
```
- 일반적으로 while문은 반복 횟수를 정하지 않고 특정 조건까지 반복하고자 할 때 주로 사용한다.
- 예를들어, 자연수를 순서대로 더해 합계가 처음으로 100보다 커지는 때의 숫자와 합계를 알고 싶을 떄 while문을 사용할 수 있다.
- while문의 조건식에 true를 넣으면 항상 문이 열려있는 상황이므로 실행 구문은 무한 반복된다.
### do-while 반복 제어문
>> do-while문은 while문과 매우 비슷한 반복 제어문으로, 조건식의 검사와 반복 실행의 순서에만 차이가 있다.<br>
>> while문은 조건식을 먼저 검사하므로 최소 반복 횟수는 0이지만<br>
>> do-while문은 일단 실행한 후 조건식을 검사하므로 최소 반복 횟수가 1이다.
- do-while문의 구조
```
초기식;
do {
  실행 구문;          // 최초 1회는 무조건 시행
} while (조건식);     // 문법 구조상 중괄호가 없으므로 세미콜론(;)으로 끝남
```
### 제어문의 중복
>> 각 제어문 내부에는 또 다른 제어문을 포함할 수 있다.<br>
>> 예를 들어 if 문 내에 if문, switch문 내에 for문, for문 내에 for문 등 제어문을 얼마든지 중복하여 사용할 수 있다.
## 제어 키워드
### break 제어 키워드
- break는 'if문을 제외한 가장 가까운 중괄호({})를 탈출' 하는 제어 키워드다.
- 일반적으로 break는 반복문에서 특정 조건을 만족할 때 반복문을 탈출하는 데 사용한다.
- 꼭 기억할 점은 **break를 이용해 탈출하는 것은 if문을 제외한 가장 가까운 중괄호 하나**라는 것이다. 
- **break로 다중 반복문을 한 번에 탈출하는 방법은 break + Lable(레이블) 문법**이다.
### continue 제어 키워드
- continue는 반복 제어문의 닫힌 중괄호(})역할을 하는 제어 키워드.
- 반복문 실행 도중 continue를 만나면 실행해야 할 코드가 남아있더라도 마치 닫힌 중괄호를 만난 것처럼 다음반복을 위해 증감식을 수행하거나 조건식을 검색한다.
- 따라서 continue는 주로 반복 과정엥서 특정 구문을 실행하지 않고 건너뛰고자 할 때 사용한다.
- <b>continue도 continue + Lable문법을 사용</b>할 수 있다.
  - 따라서 해당 방법으로 한 번에 여러 개의 반복문을 건너뛸 수 있다.    
