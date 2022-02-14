package first;

public class part4oop2 {
}

class Person {
    String name;
    int age;
    int weight;
    String str1 = "사람클래스";

    Person(){}
    Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void wash(){System.out.println("씻다");}
    void study(){System.out.println("공부하다");}
    void play(){System.out.println("놀다");}
    void who(){System.out.printf("%s는 %d살이며 %d kg이다. \n", name, age, weight);}
    void im() {System.out.println("나는 사람이오.");};
}

interface Allowance{
    String nation = "대한민국";
    void in(int price, String name);
    void out(int price, String name);
    // public abstract 생략됨.
}

interface Train{
    void train(int price, String name);
}

class Student extends Person implements Allowance, Train{

    String str1 = "학생클래스";

    Student(String name, int age, int weight){
        super(name, age, weight);
    }

    public void in(int price, String name){
        System.out.println(price + "원 을" + name + "에게 받았습니다.");
    }
    public void out(int price, String name){
        System.out.println(price + "원 을을" + name + "에 썼습니다.");
    }
    public void train(int price, String name){
        System.out.printf("%s(을)를 %d원에 공부했다.", name, price);
    }
    public void im() {System.out.println("나는 학생입니다.");}
    public void x(){
        im();
        super.im();
    }
}
