package Assignment2.Part1;


public class Part1Q4 {
    public static void main(String[] args) {
        int i =1;
        int totalNum = 5;
        int mid = 3;
        int num = 1;

        while (i<=5){
            int spaces;
            int count;

            if (i<=mid){
                spaces = mid - i;
                count = i;
            }
            else {
                spaces = i - mid;
                count = totalNum - i + 1;
            }

            int s =0;
            while (s<spaces) {
                System.out.print(" ");
                s++;
            }

            int j=0;
            while (j<count){
                System.out.print(num+ " ");
                num++;
                j++;
            }

            System.out.println();
            i++;
        }
        
    }
}
