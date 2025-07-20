//Write a program to check whether the given two numbers are equal or not w/o using comparison operator?

import java.util.Scanner;

public class Q4 {
    public static void equalOrNot(int a, int b){
         int value = a-b;
         switch(value) {
            case 0:
                System.out.println(a + " and " +b + " is equal.");
                break;
            default :
                System.out.println(a + " and " +b + " is not equal.");
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        equalOrNot(a, b);
        sc.close();
    }
}
