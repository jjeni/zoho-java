package Assignment2.Part2;

import java.util.Scanner;

public class Part2Q1 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Elements one by one : ");
        for(int i=0; i<n; i++){
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        int sum =0;
        for(int num : arr){
            if(num%2 !=0){
                sum = sum + num;
            }
        }

        System.out.println("Sum of Odd numbers in the array is : " + sum);
    }
}
