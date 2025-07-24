package Assignment2.Part2;

import java.util.Scanner;

public class PartQ9 {
    public static void tableFormat(int[][] arr){
        System.out.printf("%-10s %-10s %-10s%n", "Roll No", "Total Marks", "Average");
        System.out.println("---------------------------------------");
        for(int i=0; i<arr.length; i++){
            int totalMark = 0;
            int avg = 0;
            for(int j=0; j<arr[i].length; j++){
                if(j==0){
                    System.out.printf("%-12d", arr[i][j]);
                }
                else {
                    totalMark = totalMark + arr[i][j];
                }
            }
            avg = totalMark / 3;
            System.out.printf("%-12d", totalMark);
            System.out.printf("%-12d", avg);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] data = new int[2][4];
        Scanner sc = new Scanner(System.in);

    for(int i=0; i<2; i++){
        System.out.println("Enter the the details of Student No : "+ (i+1));
        for(int j=0; j<4; j++){
            if(j==0){
                System.out.print("Enter the Roll Number of Student :");
                data[i][j]= sc.nextInt();
            }
            else {
                System.out.print("Enter the Mark of Subject " + j + " : ");
                data[i][j]= sc.nextInt();
            }
        }
    }
    tableFormat(data);
    }
}
