package first;


public class Test {
    public static void main(String[] args){
        Student k = new Student("한구",17, 77);
        k.who();
        k.in(30000, "복권");
        k.out(15000, "음주가무");
        k.train(15000, "경마");
        System.out.println(k.nation);
        System.out.println(Allowance.nation);

    }
}

//pull test complete
