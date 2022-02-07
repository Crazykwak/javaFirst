package first;
import java.util.Arrays;

public class part2Arr {

    public void tArr() {
        int[] you = new int[5];
        for(int i =0; i <you.length;i++) {
            you[i] = i;
        }
        System.out.println(Arrays.toString(you));
    }

    public void arrforprint(){
        int[] noob = {3, 11, 22, 33, 44};
        Double[] ar2 = {3.14, 3.33, 7.81};
        for(int A:noob){
            System.out.print(A + " ");
        }
        System.out.println("마지막 숫자는" + noob[noob.length-1]);
        System.out.println(Arrays.toString(ar2));
    }

    public void arrcopy(){
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.arraycopy(arr, 2, arr2, 4, 3);
        System.out.println(Arrays.toString(arr2));

    }
}
