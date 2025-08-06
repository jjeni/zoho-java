package Assignment9;

import java.util.Scanner;



public class Q4 {
    public static int parseStringToInt(String str) throws NumberFormatException{
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        String s = sc.nextLine();
        try {
            int num = parseStringToInt(s);
            System.out.println("Number : "+num);
        } catch(Exception e){
            System.out.println("Error: '" + e + "' is not a valid integer.");
        }
    }
}
