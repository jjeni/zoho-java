package Assignment9;

public class Q5 {

    public static String trueMethod(){
            while(true){
            try {
                return "Try Block";
            } catch(Exception e){
                System.out.println(e);
            } 
            finally{
                System.out.println("Finally Block");
            }
        }
    }
    public static void main(String[] args) {
        String result = trueMethod();
        System.out.println("Method returned: " + result);

    }
}
