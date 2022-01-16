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
        String a = "Hello Java! my Java";
        System.out.println("정답은 " + a.indexOf("Java"));
    }
}

//  git test text in Ubuntu
