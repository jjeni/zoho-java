package Assignment2.Part1;
import java.util.*;
public class Part1Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N :");
        int n = sc.nextInt();
        int sum =0;
        int x = 1;
        while(x<=n){
            x++;
            if((x-1)%2 !=0){
                continue;
            }
            sum = sum + (x-1);
            
        }
        System.out.println("Sum of even numbers of the series is : " +sum);
        sc.close();
    }
}
