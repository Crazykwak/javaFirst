package first;


import java.util.Arrays;
import java.util.Random;

public class Test {

    public static void main(String[] args){

        MaxMin a = new MaxMin();

        int[] randomNum = new int[10];
        for(int i = 0; i < randomNum.length; i++){
            randomNum[i] = (int)(Math.random()*100);
        }

        System.out.println("Math로 생성된 숫자 " + Arrays.toString(randomNum));
        System.out.println("[최대값, 최소값] = " + Arrays.toString(a.maxmin(randomNum)));


        Random lott = new Random();
        for(int i = 0; i < randomNum.length; i++){
            randomNum[i] = lott.nextInt(101);
        }

        System.out.println("Random 클래스로 생성된 숫자 = "+Arrays.toString(randomNum));
        System.out.println("[최대값, 최소값] = " + Arrays.toString(a.maxmin(randomNum)));
    }
}

//pull test complete
