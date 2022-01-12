package first;

import java.util.Arrays;

public class Test {
    public int plusNum(int[] array){
        return (int) Arrays.stream(array).average().orElse(0);
    }
    public static void main(String[] args){
        int[] x = {5, 4, 3};
        Test plusNum = new Test();
        System.out.println(plusNum.plusNum(x));
    }
}
