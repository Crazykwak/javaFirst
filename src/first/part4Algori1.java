package first;

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
