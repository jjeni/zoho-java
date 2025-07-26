package Assignment2.Part3;

import java.util.Scanner;

public class Part3Q4 {
    public static void addedLetter(String s, String t){
        for (char letter : t.toCharArray()){
            if (s.indexOf(letter) == -1){
                System.out.println(letter);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String s = sc.nextLine();
        System.out.print("Enter String 2 : ");
        String t = sc.nextLine();
        addedLetter(s, t);
    }
}
