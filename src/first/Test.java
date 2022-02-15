package first;


import java.util.Arrays;
import java.util.Collections;

public class Test {

    public static void main(String[] args){

        Integer[] a = {88, 50, 38, 100, 90, 100, 99, 65};

        Arrays.sort(a);
        System.out.println("오름차순 정렬 : "+ Arrays.toString(a));

        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("내림차순 정렬 : "+ Arrays.toString(a));
    }
}

//pull test complete
