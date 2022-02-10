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
    }
}

//pull test complete
