package Assignment2.Part3;

import java.util.Scanner;

public class Part3Q2 {

    public static String covertTo(int columnNum){
        StringBuilder sb = new StringBuilder();

        while (columnNum >0){
            columnNum--;
            int rem = columnNum % 26;
            char ch = (char)('A'+rem);
            sb.insert(0, ch);
            columnNum = columnNum /26;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the column number : ");
        int n = sc.nextInt();
        System.out.println(covertTo(n));
    }
}
