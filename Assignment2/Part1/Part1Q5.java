package Assignment2.Part1;

public class Part1Q5 {
    public static void main(String[] args) {
        int i = 1;
        int mid =3;
   
        while (i <= 3) {
            int j = 1;
            while (j <= i) {
                System.out.print("w ");
                j++;
            }
            System.out.println();
            i++;
        }

        i=2;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("w ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
