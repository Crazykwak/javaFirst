package first;


import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> A = new ArrayList<String>();
        A.add("악어");
        A.add("하마");
        A.add("타조");
        A.add("당나귀");

        Iterator<String> iter = A.iterator();

        while(iter.hasNext()){
           String str = iter.next();
           if( "하마".equals(str)){
               System.out.println("하마 삭제");
               iter.remove();
           }
        }

        System.out.println(A);
    }
}
