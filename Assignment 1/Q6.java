// 6. Write a program that illustrate the Explicit type casting?

public class Q6 {
    public static void main(String[] args) {

        double x = 1240.398798452;
        // Explicit type casting Double to Integer
        int y = (int) x;
        float z = (float) x;
        System.out.println("The Value of (double) : "+x+ " after Type Casting into Integer is :  " +y);
        System.out.println("The Value of (double) : "+x+ " after Type Casting into Float is :  " +z);

    }
}
