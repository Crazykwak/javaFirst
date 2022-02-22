package first;


import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer[]> A = new ArrayList<Integer[]>();
        A.add(new Integer[]{1,2});
        A.add(new Integer[]{3,4});
        A.add(new Integer[]{5,6});


        for(Integer[] i : A){
            System.out.println(Arrays.deepToString(i));
        }

        for(int i = 0; i < A.size(); i++){
            System.out.println(A.get(i)[0]);
        }

        for(int i = 0; i < A.size(); i++){
            for(int j =0; j < A.get(0).length; j++){
                System.out.print(A.get(i)[j] + " ");
            }
            System.out.println();
        }
    }
}
