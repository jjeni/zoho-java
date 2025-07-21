package Assignment2.Part1;
public class Part1Q2 {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i==j){
                    System.out.print("1");
                }
                else if(4-j == i){
                    System.out.print("1");
                }
                else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
