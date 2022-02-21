package first;


import java.util.Arrays;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        Sample A = new Sample("안녕하세요");
        System.out.println(A.getObj());
        String str = (String)A.getObj();

        A.printInfo();

        Sample B = new Sample(100);
        System.out.println(B.getObj());
        int num = (int)B.getObj();
        B.printInfo();

        Sample C = new Sample(new Object());
        System.out.println(C.getObj());
        C.printInfo();

        Sample2<String> A1 = new Sample2<String>("안녕하세요? ㅋㅋ루삥봉");
        System.out.println(A1.getObj());
        String str2 = A1.getObj();
        System.out.println("잘 되나? " + str2);
        A1.printInfo();

        Sample2<Integer> B1 = new Sample2<Integer>(100);
        System.out.println(B1.getObj());
        int num2 = B1.getObj();
        System.out.println(100 + num2);
        B1.printInfo();
    }
}

//pull test complete
