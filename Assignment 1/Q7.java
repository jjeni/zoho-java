//7. Write a program to check if a number is a power of 2?

import java.util.Scanner;

public class Q7 {

public static boolean twoPower(int a){
    while(a%2==0){
        a = a/2;
    }
    return (a==1);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println(twoPower(a));
    }
}
