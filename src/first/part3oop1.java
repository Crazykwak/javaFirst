package first;


public class part3oop1 {
    public void Jinsu() {
        int a = 1;
        int b = 2;
        String A = "1";
        String B = "2";
        int C = Integer.parseInt(A) + Integer.parseInt(B);
        int D = Integer.parseInt("1004", 8);
        String E = Integer.toBinaryString(967);
        String F = Integer.toOctalString(967);
        String G = Integer.toHexString(967);
        System.out.println();
        System.out.println(a+b);
        System.out.println(A+B);
        System.out.println("parseInt 사용 : "+C);
        System.out.println("1001(8진수)를 십진수로  : " + D);
        System.out.println("10진수 967을 2진수로 Integer.toBinaryString : " + E);
        System.out.println("10진수 967을 8진수로 Integer.toOctalString : " + F);
        System.out.println("10진수 967을 16진수로 Integer.toHexString : " + G);
    }
}

class FarmMachine {
    int price;
    int year;
    String color;

    void move(){
        System.out.println("Farm-machine is moving.");
    }

    void dig(){
        System.out.println("Farm-machine is digging.");
    }

    void grind(){
        System.out.println("Farm-machine is grinding.");
    }
}

class Person{
    // Attribute 속성
    int age = 11;
    String name = "홍길동";

    //Constructor 생성자
    Person(){}
    Person(int age, String name){
        this.age = age;
        this.name = name;
    } //오버로딩

    //Method 메서드
    void move(){
        System.out.println("Person is moving");
    }
    void who(){
        System.out.println("age is " + age + " name is " + name);
    }
}