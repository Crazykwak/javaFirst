package first;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        int[] ar1 = {20,21,22,23,24};
        char[] ar2 = {'a', 'b', 'c', 'd', 'e'};
        String[] na = {"홍길동", "김또깡", "곽영희", "김철수", "밥샵"};
        people[] ar3 = new people[5];

        for(int i = 0; i < ar1.length; i++){
            ar3[i] = new people(na[i], ar1[i]);

            ar3[i].who();
            System.out.println();
        }

        for(int i = 0; i < ar3.length; i++){
            System.out.println(i + "번 후보자 --> 나이 : "
                    + ar3[i].getAge() + ",  이름 : " + ar3[i].getName());
        }

    }
}

//pull test complete
