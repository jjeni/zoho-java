package Assignment2.Part3;

import java.util.Scanner;

public class Part3Q5 {
    public static boolean subSequence(String s, String t){
        boolean flag = true;
        int prev = 0;
        for(char letter : s.toCharArray()){
            int index = t.indexOf(letter);
            if (index >= prev){
                prev = index;
                continue;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String s = sc.nextLine();
        System.out.print("Enter String 2 : ");
        String t = sc.nextLine();
        System.out.println(subSequence(s, t));
    }
}
