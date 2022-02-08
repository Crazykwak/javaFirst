package first;

import java.util.Locale;

public class part3 {

    public void plus(int a, int b){
        System.out.printf("받은 인자값은 %d와 %d \n", a,b);
        int result = a + b;
        System.out.printf("결과값은 %d다.", result);
    }

    public String num(){
        String Suc = "성공!";
        return Suc;
    }

    public String upper(String str){
        return str.toUpperCase(Locale.ROOT);
    }
}
