// 3.Write a program to find the maximum of two numbers using ternary operator.

import java.util.Scanner;

public class Q3 {

    public static int maxTwo(int a, int b){
        int result = (a>b) ? a : b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        System.out.println("The Maximum number between "+a+ " and "+b+ " is : " +maxTwo(a, b));
    }
}
