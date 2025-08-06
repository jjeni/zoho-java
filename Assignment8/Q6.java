package Assignment8;


public class Q6 {
    public static void changeValue(int x) {
        x = 100;
    }

    public static void main(String[] args) {
        int a = 50;
        changeValue(a);
        System.out.println("Value of a: " + a); 
} }
