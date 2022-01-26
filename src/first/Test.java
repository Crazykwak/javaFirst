package first;
import java.util.Arrays;

public class Test {
    public int plusNum(int[] array) {
        int sum = 0;
        for (int j : array) sum += j;
        return sum / array.length;
    }
    public String arrStr(String str){
        String[] result = str.split(" ");
        return Arrays.toString(result);
    }

    public void var(){
        System.out.println("Byte의 크기 " + Byte.SIZE + "비트" + " -Byte의 범위 " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("short의 크기 " + Short.SIZE + "비트" + " -short의 범위 " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int의 크기 " + Integer.SIZE + "비트" + " -int의 범위 " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long의 크기 " + Long.SIZE + "비트" + " -long의 범위 " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("char의 크기 " + Character.SIZE + "비트" + " -char의 범위 " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
    }

    public void typeTrans(){
        short a = 'A';
        short b = 90;
        char c = 'C';
        System.out.println(a);
        System.out.println((char) b);
        System.out.println((short)c); // 아스키 코드로 나오넹
    }

    public void prinF(){
        //print출력은 지시자를 사용함. %d(정수), %f(소수점), %c(문자), %s(문자열) %b(부울), %n(줄바꿈)임
        // %e(지수), %o(8진수), %x(16진수)
        // 요걸 이용해서 꾸며줌 예시는 아래.
        int baba = 33;
        int Bow = 18;
        float po = 1.04F;
        int ten = 10;
        System.out.printf("나는 %d살 곽우종이다 %d 좆같네 %n", baba, Bow); // "나는 33살 곽우종이다 18 좆같네"가 됨.
        // 무적권 순서대로 대입이 되니까 순서를 잘 봐야함. 지시자대로 들어가는게 아님. 무적권 순서
        // js에선 걍 ${}로 때려버린거 같은데 후후
        System.out.printf("인생은 쩜사다 바로 %.2f", po);
        // float, double같은 실수의 경우 자릿수를 정해줘야함. (안해도 되지만 해야지) 그럴 경우 %. 이후에 숫자를 넣는게 좋음
        System.out.printf("%n 10은 10진수로 10이고 8진수로는 %o 이고 16진수로는 %x다.", ten, 10);
    }

    public static void main(String[] args){
        Test met = new Test();
        String a = "Hello Java";
        System.out.println(met.arrStr(a));
        met.prinF();
    }
}

//  git test text in Ubuntu
