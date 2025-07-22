package Assignment2.Part2;

import java.util.Scanner;

public class Part2Q2 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Elements one by one : ");
        for(int i=0; i<n; i++){
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        System.out.print("Prime NUmbers in Array are : ");
        
        for(int num : arr){
            boolean isPrime = true;
            if(num<=1){
                 isPrime = false;
            }
            else {
                for(int i=2; i<=Math.sqrt(num); i++){
                    if(num%i == 0){
                    isPrime = false;
                       break; 
                    }
                  
                }
            }
            if (isPrime == true){
                System.out.print(num+ " ");
            }
        }
    }
}
