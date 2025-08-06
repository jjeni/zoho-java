package Assignment9;

public class Q1 {
   public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 0, 7};

        try {
            int quotient = arr[7] / arr[4]; 
            System.out.println("Quotient: " + quotient);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Program finished.");
        }
   } 
}
