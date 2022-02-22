package first;


import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(3);
        A.add(5);
        A.add(7);
        A.add(9);
        ArrayList<Integer> B = new ArrayList<Integer>();
        B.add(5);
        B.add(9);
        System.out.println(A.size());
        System.out.println(A);
        System.out.println(B);
        A.removeAll(B);
        System.out.println("A-B = " + A );
        System.out.println(A.size());
    }
}

//pull test complete
