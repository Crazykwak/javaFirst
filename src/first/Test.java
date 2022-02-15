package first;


import java.util.Arrays;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        int[] a = {88, 50, 38, 100, 90, 100, 99, 65};

        Rank rnk = new Rank();
        int[] b = rnk.rank(a);
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d점은 %d등이다. ", a[i], b[i]);
            if(i == a.length/2 -1) System.out.println();
        }

    }
}

//pull test complete
