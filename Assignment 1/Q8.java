//8. Write a program to find the first set bit of a number?


import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int n = sc.nextInt();
        int count = 1;
        if (n == 0) {
            System.out.println("No set bits found.");
        }
        while(n!=0){
            int s = n %2;
            n = n/2;
            if (s==1){
                System.out.println("The Position of the first set bit occurs in : " + count);
                break;
            }
            count ++;
        }
        sc.close();
    }
}
