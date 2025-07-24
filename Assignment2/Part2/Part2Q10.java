package Assignment2.Part2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Part2Q10 {
    public static int[][] inputArr(int m, int n, int arr[][]){
        System.out.println("ADD ELEMENTS IN THE ARRAY : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<m; i++){
           for(int j=0; j<n; j++){
                System.out.print("Enter the element in ["+i+","+j+"] : ");
                arr[i][j] = sc.nextInt();
           } 
        }
        System.out.println("Array saved succesfuly .....");
        return arr;
    }

    public static void displayArr(int arr[][]){
        System.out.println("DISPLAYING ARRAY : ");
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
        System.out.println();
        }
    }

    public static void sumArr(int [][] arr){
        int sum = 0;
        for (int[] row : arr) {
            for (int value : row) {
                sum = sum + value;
            }
        }
        System.out.println("SUM OF ARRAY : " + sum);

    }

    public static void rowSum(int[][] arr){
        
        for(int i=0; i<arr.length; i++){
        int sum =0;
           for(int j=0; j<arr[i].length; j++){
                sum = sum + arr[i][j];
           }
        System.out.println("SUM OF ROW " +i +" : " + sum);
        }
    }

    public static void columnSum(int[][] arr){
        
        for(int i=0; i<arr.length; i++){
        int sum =0;
           for(int j=0; j<arr[i].length; j++){
                sum = sum + arr[j][i];
           }
        System.out.println("SUM OF COLUMN " + i +" : " + sum);
        }
    }

    public static void transposeMatrix(int[][] matrix, int m, int n) {
        System.out.println("TRANSPOSE OF THE MATRIX:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows m : ");
        int m = sc.nextInt();
        System.out.print("Enter the size of columns n : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        
        System.out.println("--------------------------------");
        System.out.println("-------------MENU--------------");
        System.out.println("|  1.INPUT ELEMENTS           |");
        System.out.println("|  2.DISPLAY ELEMENTS         |");
        System.out.println("|  3.SUM OF ELEMENTS          |");
        System.out.println("|  4.SUM OF ROW ELEMENTS      |");
        System.out.println("|  5.SUM OF COLUMN ELEMENTS   |");
        System.out.println("|  6.TRANSPOSE OF ELEMENTS   |");
        System.out.println("|         (-1 to Quit)        |");
        System.out.println("--------------------------------");

        int menu = 0;
        while (menu!=-1){
            System.out.print("Enter the menu : ");
            menu = sc.nextInt();
            switch (menu) {
                case -1:
                    break;
                case 1:
                    arr = inputArr(m, n, arr);
                    break;
                case 2:
                    displayArr(arr);
                    break;
                case 3 :
                    sumArr(arr);
                    break;
                case 4:
                    rowSum(arr);
                    break;
                case 5:
                    columnSum(arr);
                    break;
                case 6:
                    transposeMatrix(arr, m, n);
                    break;
                default:
                    System.out.print("Enter correct menu .....");
            }
        }
    }
}
