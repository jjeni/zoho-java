package Assignment2.Part2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Part2Q3 {
    public static void main(String[] args) {
        int[] arr = new int[30];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<30; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println("First 30 Fibonacci numbers:");
        for (int i = 0; i < 30; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
