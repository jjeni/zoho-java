package Assignment2.Part1;

import java.util.Scanner;

public class Part1Q10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Mark of the Student : ");
        int Percent = sc.nextInt();

        // Using If-esle

        if(Percent >= 85 && Percent <= 100){
            System.out.println("Grade 'A'");
        }
        else if (Percent>=70){
            System.out.println("Grade 'B'");
        }
        else if (Percent>=50){
            System.out.println("Grade 'C'");
        }
        else {
            System.err.println("Fail");
        }

        //Using Switch case

        int range = Percent / 10;

        switch (range) {
            case 10:
            case 9:
            case 8:
                if (Percent >= 85) {
                    System.out.println("Grade: 'A'");
                } else {
                    System.out.println("Grade: 'B'");
                }
                break;
            case 7:
                System.out.println("Grade: 'B'");
                break;
            case 6:
            case 5:
                System.out.println("Grade: 'C'");
                break;
            default:
                System.out.println("Fail");
            }
        
    }
    
    
}
