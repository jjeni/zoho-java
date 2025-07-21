//1. Write a program that uses if statement to find the minimum of three numbers.

package Assignment2.Part1;

import java.util.Scanner;

public class Part1Q1 {

    public static int minOfThree(int a, int b, int c){
        int m = b;
        if (a<b){
            m = a;
        }
        if (c<m){
            m = c;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        System.out.println("Minimum is : " + minOfThree(a, b, c));
        sc.close();
    }
}
