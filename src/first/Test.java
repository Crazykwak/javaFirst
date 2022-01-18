package first;
import java.util.Arrays;

public class Test {
    public int plusNum(int[] array) {
        int sum = 0;
        for (int j : array) sum += j;
        return sum / array.length;
    }
    public String arrStr(String str){
        String[] result = str.split(" ");
        return Arrays.toString(result);
    }
    public static void main(String[] args){
        Test met = new Test();
        String a = "Hello Java";
        System.out.println(met.arrStr(a));
    }
}

//  git test text in Ubuntu
