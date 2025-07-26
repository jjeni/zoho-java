package Assignment2.Part3;

import java.util.Scanner;

public class Part3Q8 {
    public static boolean rightCase(String s){
        if(s.toUpperCase().equals(s)){
            return true;
        }
        if(s.toLowerCase().equals(s)){
            return true;
        }
         if (Character.isUpperCase(s.charAt(0)) && s.substring(1).equals(s.substring(1).toLowerCase())) {
            return true;
        }
    return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        System.out.println(rightCase(s));
    }
}
