package Assignment2.Part2;

import java.util.Scanner;

public class Part2Q6 {
    public static String binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;

        while(left<=right){
            int mid = (left+right) /2;
            if (arr[mid]==target){
                return "Valid";
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right = mid -1;
            }
        }
        return "Not valid";
    }
    public static void main(String[] args) {
        int[] arr = {1982, 1987, 1993, 1996, 1999, 2002, 2003, 2006, 2007, 2009, 2010, 2016};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year of graduation : ");
        int target = sc.nextInt();
        System.out.println(binarySearch(arr, target));
    }
}
