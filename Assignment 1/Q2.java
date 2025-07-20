//2. Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        //primitive
        byte age = 10;
        short days = 1000;
        int minutes = 100000;
        long seconds = 100000000;
        float a = 100.1f;
        double b = 10000.11;
        char c = 'j';
        boolean value = false;
        // non-primitive
        String res = "Hello, world!";
        int[] arr = {1,1,1,1};
        System.out.println("Primitive Data type : byte, short, int, long, float, double, char, boolean.");
        System.out.println(age);
        System.out.println(days);
        System.out.println(minutes);
        System.out.println(seconds);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(value);
        System.out.println("Non-primitive data type : String, Array.");
        System.out.println(res);
        System.out.println(Arrays.toString(arr));


    }
}
