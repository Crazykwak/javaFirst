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


        Student s1 = new Student("백", 17, 80);
        Person s2 = new Student("듀", 20, 70);
        Person p1 = new Person("팍", 20, 17);

        s2.who();

        ((Student)s2).in(100, "테스트");



    }
}

//pull test complete
