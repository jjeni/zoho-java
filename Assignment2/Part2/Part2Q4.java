package Assignment2.Part2;

import java.util.Scanner;

public class Part2Q4 {
    public static void print(int len, int[] arr){
        int sumOfSingle = 0;
        int sumOfTwo = 0;
        for(int num : arr){
            if(num>=-9 && num<=9){
                sumOfSingle = sumOfSingle + num;
            }
            if(num>=-99 && num <=-10 || num>=10 && num<=99){
                sumOfTwo = sumOfTwo + num;
            }
        }
        System.out.println("The sum of Single digits in the Array : "+sumOfSingle);
        System.out.println("The sum of Two digits in the Array : "+sumOfTwo);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length(len) : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter elements : ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        print(len, arr);
    }
}
