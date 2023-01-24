package org.opentutorials.javatutorials.exception;

import java.io.*;

// class B에서 발생할 수 있는 예외를 throws에 담아 B를 사용하는 사용자에게 예외처리를 책임전가함
// class B에서 try, catch를 통해 직접 예외처리를 하지 않았음.
class B{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}

// class C는 class B를 사용함.
// class C에서 발생할 수 있는 예외를 throws에 담아 C를 사용하는 사용자에게 예외처리를 책임전가함
// class C에서 try, catch를 통해 직접 예외처리를 하지 않았음.
class C{
    void run() throws IOException, FileNotFoundException{
        B b = new B();
        b.run();
    }
}

// main은 class C를 사용하고있음
// throws를 통해 예외처리를 계속 책임전가형 최종 사용자인 main에서 try, catch를 사용하여 예외처리를 하고 있는 모습임을 알 수 있다. 
public class ThrowExceptionDemo {
    public static void main(String[] args) {
         C c = new C();
         try {
            c.run();
        } catch (FileNotFoundException e) {
            System.out.println("out.txt 파일은 설정 파일 입니다. 이 파일이 프로잭트 루트 디렉토리에 존재해야 합니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}
