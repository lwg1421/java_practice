package org.opentutorials.javatutorials.exception;

class A2{
    private int[] arr = new int[3];
    A2(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("Exception");
        // finally는 try 구문에서 예외가 발생하는 것과 상관없이 언제나 실행되는 로직이다.
        /*
         * 예를 들어 데이터베이스를 사용한다면 데이터베이스 서버에 접속해야 한다. 
         * 이때 데이터베이스 서버와 여러분이 작성한 에플리케이션은 서로 접속상태를 유지하게 되는데 
         * 데이터베이스를 제어하는 과정에서 예외가 발생해서 더 이상 후속 작업을 수행하는 것이 불가능한 경우가 있을 수 있다. 
         * 예외가 발생했다고 데이터베이스 접속을 끊지 않으면 데이터베이스와 연결 상태를 유지하게 되고 
         * 급기야 데이터베이스는 더 이상 접속을 수용할 수 없는 상태에 빠질 수 있다. 
         * 접속을 끊는 작업은 예외 발생여부와 상관없기 때문에 finally에서 처리하기에 좋은 작업이라고 할 수 있다. 
         * 말하자면 finally는 작업의 뒷정리를 담당한다고 볼 수 있다.
         */
        } finally {
            System.out.println("finally");
        }
    }
}
 
public class ExceptionDemo2 {
    public static void main(String[] args) {
        A2 a2 = new A2();
        a2.z(10, 0);
        a2.z(1, 0);
        a2.z(2, 1);
    }
}
