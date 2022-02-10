package first;


public class Test {
    public static void main(String[] args){

        FarmMachine farm = new FarmMachine();
        farm.price = 10000;
        farm.year = 10;
        farm.color = "red";
        System.out.println(String.format("%,d",farm.price));
        System.out.println(farm.year);
        System.out.println(farm.color);
        farm.move();
        farm.dig();
        farm.grind();

        part3oop1 p3 = new part3oop1();
        p3.Jinsu();

        Person P = new Person(20, "김백수");
        Person J = new Person(30, "곽백수");
        Person S = new Person(44, "황근출");
        Person T = new Person();

        P.who();
        J.who();
        S.who();
        T.who();

        cPerson ch = new cPerson(13, "곽여운", "대하초");
        ch.who();
    }
}

//pull test complete
