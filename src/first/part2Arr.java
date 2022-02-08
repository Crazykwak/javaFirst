package first;
import java.util.Arrays;
import java.util.Scanner;

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

    public void twoByArr(){
        String[][] str = {
            {"한국", "일본", "중국"},
            {"태국", "베트남", "필리핀"}
        };
        System.out.println(Arrays.deepToString(str));

        for(int i = 0; i < str.length; i++){
            for(int j =0; j < str[i].length; j++){
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }

        String[] strAr = {"Kim", "Lee", "Park"};
        System.out.println(strAr[0].charAt(2));
        for(int i = 0; i < strAr.length; i++){
            for(int j = 0; j < strAr[i].length();j++) {
                System.out.print(strAr[i].charAt(j));
            }
            System.out.println();
        }
    }

    public void inputArr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("행의 갯수를 입력하고 [Enter]를 치세요 = ");
        int R = sc.nextInt();
        System.out.print("열의 갯수를 입력하고 [Enter]를 치세요 = ");
        int C = sc.nextInt();

        char[][] gamemap = new char[R][C];
        String[] strAr = new String[R];

        for(int i = 0; i < R; i++){
            System.out.printf("%s행의 문자를 입력해주세요(길이제한 %s) = ", i+1,C);
            strAr[i] = sc.next();
            if(strAr[i].length() > C){
                System.out.print("ERROR!");
                break;
            }
            for(int j = 0; j < C; j++){
                gamemap[i][j] = strAr[i].charAt(j);
            }
        }
        System.out.print(Arrays.deepToString(gamemap));
    }
}
