package first;

import java.util.Arrays;

public class part4Algori2 {
    public int[] even(int n){
        int[] res = new int[n/2];

        int i = 1;
        int j = 0;

        while(i <= n){
            if(i % 2 == 0) {
                res[j] = i;
                i++;
                j++;
                continue;
            }  else {
                i++;
                continue;
            }
        }

        return res;
    }

    public int[] odd(int n){
        int[] res;
        if(n % 2 == 1) {
            res = new int[n / 2 + 1];
        } else {
            res = new int[n/2];
        }
        int i = 1;
        int j = 0;
        while (i <= n){
            if(i % 2 == 1){
                res[j] = i;
                i++;
                j++;
                continue;
            } else {
                i++;
                continue;
            }
        }
        return res;
    }
    public void evenTen(){
        outerloop: for(int i = 0; i < 4; i++){
            for(int j =0; j < 10; j++){
                int Num = (i*10)+j;
                if(Num % 2 !=0){
                    if(j == 1){
                        System.out.println();
                        continue outerloop;
                    }
                    continue;
                } else {
                    System.out.print(Num + " ");
                }
            }
            System.out.print("\t\t"+i*10);
            System.out.println();
        }
    }

    public void star(){
        String[][] st = new String[5][5];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i == 2 && j == 2){
                    st[i][j] = " ★ ";
                } else {
                    st[i][j] = " □ ";
                }
                System.out.print(st[i][j]);
            }
            System.out.println();
        }

        System.out.print(Arrays.deepToString(st));
    }
}
