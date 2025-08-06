package Assignment9;

public class Q3 {
    public static void main(String[] args) {
        try {
            Class.forName("Assignment9.Q1"); 
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        }
    }
}
