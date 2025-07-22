package Assignment2.Part1;

import java.util.Scanner;

public class Part1Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number N : ");
        int n = sc.nextInt();
        String result ="";
        int rem =0;
        while(n!=0){
            rem = n%2;
            n = n/ 2;
            result = rem+result;
        }
        System.out.println("Decimal to Binary : " + result);
    }
}
