package Assignment2.Part3;

import java.util.Scanner;

public class Part3Q6 {
    public static String addString(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() -1;
        int carry = 0;
        while (i >=0 || j >= 0 || carry !=0) {
            int digit1 = (i>=0) ? a.charAt(i) - '0' : 0;
            int digit2 = (j>=0) ? b.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            sb.insert(0, sum%10);
            carry = sum/10;

            i--;
            j--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String s = sc.nextLine();
        System.out.print("Enter String 2 : ");
        String t = sc.nextLine();
        System.out.println(addString(s, t));
    }
}
