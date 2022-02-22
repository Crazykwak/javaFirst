package first;

import java.util.ArrayList;

public class part5_1 {
}

class Sample{
    // Non Generic lol
    //Field
    private Object obj;

    //Constructor
    Sample(Object x){
        this.obj = x;
    }

    //Method
    public Object getObj() {
        return obj;
    }

    void printInfo(){
        System.out.println(obj.getClass().getName());
    }
}

class Sample2 <T> {
    //Field
    private T obj;


    //Constructor
    Sample2(T obj) {
        this.obj = obj;
    }

    //Method
    T getObj(){
        return obj;
    }
    void printInfo(){
        System.out.println(obj.getClass().getName());
    }
}

class RandomN {

    void swa(){
        ArrayList<Integer> Rnum = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Rnum.add((int) (Math.random() * 10 + 1));
        }

        System.out.println(Rnum);
    };
}
