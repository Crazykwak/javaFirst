package first;


import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        part1 met = new part1();
        part2Arr arr = new part2Arr();
        part3 method = new part3();
        tNum a = new tNum(100);

        String[] result = method.change("Korea", "usa");
        System.out.println(Arrays.toString(result));

    }
}

//pull test complete
