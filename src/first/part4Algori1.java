package first;

import java.util.Arrays;
import java.util.Collections;

public class part4Algori1 {
}

class MaxMin {
    public int max(int[] x){
        int result = x[0];
        for(int i =1; i< x.length; i++){
            if(result < x[i]){
                result = x[i];
            }
        }
        return result;
    }

    public int min(int[] x){
        int result = x[0];
        for(int i = 0; i < x.length; i++){
            if(result > x[i]){
                result = x[i];
            }
        }
        return result;
    }

    public int[] maxmin(int[] x){
        int[] result = {x[0], x[0]};
        for(int i =1; i< x.length; i++){
            if(result[0] < x[i]){
                result[0] = x[i];
            }
            if(result[1] > x[i]){
                result[1] = x[i];
            }
        }
        return result;
    }
}

class Rank{
    public int[] rank(int[] n){
        int[] res = new int[n.length];
        Arrays.sort(n);

        for(int i = 0; i < n.length; i++){
            res[i] = 1;
            for(int j = 0; j < res.length; j++){
                if(n[i] < n[j]){
                    res[i]++;
                }
            }

        }
        return res;
    }
}
