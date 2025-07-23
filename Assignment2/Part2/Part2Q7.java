package Assignment2.Part2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Part2Q7 {

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight of 10 persons one by one : ");
        int[] arr = new int[10];
        for(int i=0; i<=9; i++){
            arr[i] = sc.nextInt();

        }
        selectionSort(arr);
    }
}
