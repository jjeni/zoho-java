package Assignment2.Part1;

public class Part1Q3 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                if(i==0 || i==2){
                    System.out.print("R ");
                }
                else if((i==1 || i==4) && (j==0 || j==3)){
                    System.out.print("R ");
                }
                else if(i==3 && (j==0 || j==2)){
                    System.out.print("R ");
                }
                else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
