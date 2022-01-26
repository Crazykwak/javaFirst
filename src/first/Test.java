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

    public void var(){
        System.out.println("Byte의 크기 " + Byte.SIZE + "비트" + " -Byte의 범위 " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("short의 크기 " + Short.SIZE + "비트" + " -short의 범위 " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int의 크기 " + Integer.SIZE + "비트" + " -int의 범위 " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long의 크기 " + Long.SIZE + "비트" + " -long의 범위 " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("char의 크기 " + Character.SIZE + "비트" + " -char의 범위 " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
    }

    public static void main(String[] args){
        Test met = new Test();
        String a = "Hello Java";
        System.out.println(met.arrStr(a));
        met.var();
    }
}

//  git test text in Ubuntu
