//Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?

public class Q1 {
    String color; //Instancec variable
    static int wheels = 4; //static variable
    final static String brand = "BMW";
    public void myCar(){
        System.out.println("------ABOUT MY CAR -------");
        System.out.println("My car is "+color+" in color.");
        System.out.println("No. of whhels :" + wheels);
    }
    public static void main(String args[]){
        int milage = 25; //local variable
        Q1 car = new Q1();
        car.myCar();
        if (milage>10){
            int speed = 50;
            System.out.println("Speed :" + speed);
            System.out.println("Brand : " + brand);
        }
    }
}
