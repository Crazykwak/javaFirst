package first;

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
        for(int i = 0; i < 4; i++){
            for(int j =0; j < 10; j++){
                int Num = (i*10)+j;
                if(Num % 2 !=0){
                    continue;
                } else {
                    System.out.print(Num + " ");
                }
            }
            System.out.print("\t\t"+i*10);
            System.out.println();
        }
    }
}
