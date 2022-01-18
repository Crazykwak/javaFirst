package first;
import java.util.Arrays;

public class Test {
    public int plusNum(int[] array) {
        int sum = 0;
        for (int j : array) sum += j;
        return sum / array.length;
    }
    public static void main(String[] args){
        int[] x = {5, 4, 3};
        Test avgNum = new Test();
        String a = "Hello Java";
        String[] result = a.split(" ");
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(Arrays.toString(result));
    }
}

//  git test text in Ubuntu
