package Assignment2.Part2;

import java.util.Scanner;

public class Part2Q8 {
    public static void ageRange(int arr[]){
        int lessThan = 0;
        int mid = 0;
        int greaterThan = 0;
        for(int num: arr){
            if(num<18){
                lessThan++;
            }
            else if(num>60){
                greaterThan++;
            }
            else {
                mid++;
            }
        }
        System.out.println("The number of people less than 18 (<18): "+ lessThan);
        System.out.println("The number of people between (18-60): "+mid);
        System.out.println("The number of people greater than 60 (>60): "+greaterThan);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of 10 persons one by one : ");
        int[] arr = new int[10];
        for(int i=0; i<=9; i++){
            arr[i] = sc.nextInt();

        }
        ageRange(arr);
    }
}
