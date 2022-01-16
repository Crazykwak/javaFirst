package first;


public class Test {
    public int plusNum(int[] array) {
        int sum = 0;
        for (int j : array) sum += j;
        return sum / array.length;
    }
    public static void main(String[] args){
        int[] x = {5, 4, 3};
        Test avgNum = new Test();
        System.out.println("평균은" + avgNum.plusNum(x));
    }
}

//  git test text in Ubuntu
