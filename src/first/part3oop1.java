package first;


public class part3oop1 {
//    public void Jinsu() {
//        int a = 1;
//        int b = 2;
//        String A = "1";
//        String B = "2";
//        int C = Integer.parseInt(A) + Integer.parseInt(B);
//        int D = Integer.parseInt("1004", 8);
//        String E = Integer.toBinaryString(967);
//        String F = Integer.toOctalString(967);
//        String G = Integer.toHexString(967);
//        System.out.println();
//        System.out.println(a+b);
//        System.out.println(A+B);
//        System.out.println("parseInt 사용 : "+C);
//        System.out.println("1001(8진수)를 십진수로  : " + D);
//        System.out.println("10진수 967을 2진수로 Integer.toBinaryString : " + E);
//        System.out.println("10진수 967을 8진수로 Integer.toOctalString : " + F);
//        System.out.println("10진수 967을 16진수로 Integer.toHexString : " + G);
//    }
//}
//
//class FarmMachine {
//    int price;
//    int year;
//    String color;
//
//    void move(){
//        System.out.println("Farm-machine is moving.");
//    }
//
//    void dig(){
//        System.out.println("Farm-machine is digging.");
//    }
//
//    void grind(){
//        System.out.println("Farm-machine is grinding.");
//    }
//}
//
//class Person{
//    // Attribute 속성
//    int age = 11;
//    String name = "홍길동";
//
//    //Constructor 생성자
//    Person(){}
//    Person(int age, String name){
//        this.age = age;
//        this.name = name;
//    } //오버로딩
//
//    //Method 메서드
//    void move(){
//        System.out.println("Person is moving");
//    }
//    void who(){
//        System.out.println("age is " + age + " name is " + name);
//    }
//}
//
//class cPerson extends Person{
//    String school;
//
//    cPerson(){}
//    cPerson(int age, String name, String school){
//        super(age, name);
////        this.age = age;
////        this.name = name;
//        this.school = school;
//    }
//
//    void who(){
//        System.out.println(name +" "+ age + " years old," +"school is " + school);
//    }
}
//
//class Persons {
//    private String name;
//    private int age;
//    private int h;
//    private int w;
//
//    Persons(){}
//    Persons(String name, int age, int h, int w){
//        this.name = name;
//        this.age = age;
//        this.h = h;
//        this.w = w;
//    }
//
//    public String getName() {return name;}
//    public void setName(String name) {this.name = name;}
//
//    public int getAge() {return age;}
//    public void setAge(int age) {this.age = age;}
//
//    public int getH() {return h;}
//    public void setH(int h) {this.h = h;}
//
//    public int getW() {return w;}
//    public void setW(int w) {this.w = w;}
//
//
//    void Walk(){
//        System.out.println(this.name + " 이동중..");
//    }
//}
//
//class Villain extends Persons{
//    private String u_Key;
//    private int weapon;
//    private double power;
//
//    Villain(){}
//    Villain(String name, int age, int h, int w, String u_Key ,int weapon, double power){
//        super(name, age, h, w);
//        this.u_Key = u_Key;
//        this.weapon = weapon;
//        this.power = power;
//    }
//
//    public String getU_Key(){return u_Key;}
//    public void setU_Key(String u_Key) {this.u_Key = u_Key;}
//    public int getWeapon(){return weapon;}
//    public void setWeapon(int weapon) {this.weapon = weapon;}
//    public double getPower(){return power;}
//    public void setPower(double power) {this.power = power;}
//
//    public String rWeapon(){
//        switch (getWeapon()){
//            case 1 : {return "창";}
//            case 2 : {return "방패";}
//            case 3 : {return "칼";}
//            case 4 : {return "총";}
//            default: {return "--";}
//        }
//    }
//
//    void who(){
//        System.out.println("이름: " + getName());
//        System.out.println("나이: " + getAge() + "살");
//        System.out.println("키: " + getH() + "cm");
//        System.out.println("몸무게: " + getW() + "kg");
//        System.out.println("악당 번호: " + getU_Key());
//        System.out.println("무기: " + rWeapon());
//        System.out.println("파워: " + getPower());
//    }
//}

class people {
    private String name;
    private int age;

    people(){}
    people(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public void who(){
        System.out.println("이름 : " + getName());
        System.out.println("나이 : " + getAge());
    }
}

abstract class Animal {
    private String name;

    Animal(){}
    Animal(String name){
        this.name = name;
    }

    public String getName(){return name;}
    void setName(String name){this.name = name;}

    abstract void cry();
    void myName(){System.out.println("이름은 " + getName());}
}

class bird extends Animal {
    private String name;

    bird(){}
    bird(String name){
        this.name = name;
    }
    public String getName(){return name;}
    void setName(String name){this.name = name;}

    void fly() {System.out.println("날다");}
    void cry() {System.out.println("짹짹");}
}

class dog extends Animal {
    dog(){}
    dog(String name){
        super(name);
    }
    void cry() {System.out.println("멍멍");}
}

abstract class cow extends Animal {
    cow(){}
    cow(String name){
        super(name);
    }
}
