# 메소드
>> 메소드(method)는 코드를 재사용할 수 있게 해준다.

### 메소드의 형식 
![1834](https://user-images.githubusercontent.com/76688104/211960433-78e7aa2d-aae4-4501-b826-d9cf44b4833c.gif)
- 여기서 public은 접근 제어 범위를 설정한 것
- static은 static 메소드임을 의미
- void는 메소드의 반환형태가 별도로 지정되어있지 않음을 의미
- main은 메소드의 이름
- String[] args는 메소드의 매개변수값을 의미
- return에는 메소드 실행시 결과값으로 출력할 내용을 작성

### 메소드의 정의와 호출
- 직접 메소드를 만드는 것을 정의라고 한다. 
- 만들어진 메소드를 실행하는 것을 호출이라고 한다.
- 메소드 예시
![image](https://user-images.githubusercontent.com/76688104/211978985-51cb2a30-8e01-4f14-97af-7c009eec5f5f.png)
- numbering이라는 이름의 메소드를 정의하고 있다. 
- 이 메소드는 main이라는 이름의 메소드 안에서 호출되고 있다.

### main
- 새 클래스를 만들면 생성되는 main 메소드는 무엇일까?
- main 메소드는 규칙이다.
- 만들고 싶은 프로그램이 있다면 반드시 public static void main(String[] args)가 이끄는 중괄호 안에 실행되기를 기대하는 로직을 위치시켜야 한다. 
- 이것은 약속이기 때문에 약속을 지켜야 한다. 
- 그렇게 코드를 작성하면 자바를 실행할 때 자바는 우리가 작성한 main 메소드를 실행하게 되는 것이다. 
- 우리는 main 메소드를 작성하고, 자바는 main 메소드를 실행하는 관계라고 할 수 있다.


### return
- 메소드 내에서 사용한 return은 return 뒤에 따라오는 값을 메소드의 결과로 반환한다. 
- 동시에 메소드를 종료시킨다. 
- 한가지 잊지 말아야 할 점은 return을 통해서 반환할 값의 데이터 형식을 메소드의 이름 옆에 명시해주어야 한다는 것이다.
- 부품으로서의 가치를 높이기 위해 return을 사용한다.
- return으로 여러 개의 값을 반환하고싶다면 배열을 만들어 그 안에 데이터들을 담은 후 배열을 return 하는 방법이 있다.
- 배열 반환 예시
```
public class ReturnExample {
 
    public static String[] getMembers() {
        String[] members = { "이원근", "오성범", "하재민" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
    }
 
}
```
![image](https://user-images.githubusercontent.com/76688104/211981981-58ad89ed-5ef6-4a3d-8217-7cbc1ba81a9b.png)
- 위 사진의 numberring 메소드는 반환값이 String형 인것을 알 수 있다.
- 또한 매개변수로 두 개 값을 받고 있으며 각각 init, limit이라는 이름의 int형임을 알 수 있다.

