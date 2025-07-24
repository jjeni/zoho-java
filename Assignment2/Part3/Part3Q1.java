package Assignment2.Part3;

import java.util.Scanner;

public class Part3Q1 {
    public static String binaryS(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 ||j>=0 || carry !=0){
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = bitA + bitB + carry;
            int currentValue = sum%2;
            carry =sum /2;

            sb.insert(0, currentValue);
            i--;
            j--;
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Binary String : ");
        String a = sc.nextLine();
        System.out.print("Enter the second Binary String : ");
        String b = sc.nextLine();
        System.out.println("Sum as Binary String : " + binaryS(a, b));
        
    }
    
}
