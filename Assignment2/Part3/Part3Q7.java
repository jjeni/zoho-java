package Assignment2.Part3;

import java.util.Scanner;

public class Part3Q7 {
    public static int sequence(String s){
        s.trim();
        if (s.isEmpty()) return 0;
        String[] mys = s.split("\\s+");
        return mys.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String s = sc.nextLine();
        System.out.println(sequence(s));
    }
}
