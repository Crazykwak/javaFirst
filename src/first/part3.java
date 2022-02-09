package first;

import java.util.Locale;

class tNum {
    int num;
    tNum(int num) {this.num = num;}
}

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

    public void sumhoi(tNum a){
        a.num += 400;
        System.out.println(a.num);
        // call by value
    }

    public int[] twoRe(){
        int num1 = 100;
        int num2 = 200;
        int[] result = {num1, num2};
        return result;
    }

    public String[] change(String str1, String str2){
        String a = str1.toUpperCase();
        String b = str2.toLowerCase();
        String[] res = {a, b};
        return res;
    }
}


