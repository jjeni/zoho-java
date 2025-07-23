package Assignment2.Part2;

public class Part2Q5 {

    public static boolean identicalCheck(char[] x, char[] y){
        boolean flag = true;
        if(x.length == y.length){
            for(int i=0; i<x.length; i++){
                if(x[i] != y[i]){
                    flag =false;
                    break;
                }
            }
        }
        else {
            flag =false;
        }
        return flag;
    }
    public static void main(String[] args) {
        char[] X = {'m', 'n', 'o', 'p'};
        char[] Y = {'m', 'n', 'o', 'p'};
        System.out.println(identicalCheck(X, Y));
    }
}
