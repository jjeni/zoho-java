package assignment6;

import assignment6.arithmetic.Calculator;
import assignment6.stringutils.StringHelper;


public class Q2 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        StringHelper str = new StringHelper();

        int a = 21, b = 7;
        System.out.println("Addition: " + cal.add(a, b));
        System.out.println("Subtraction: " + cal.subtract(a, b));
        System.out.println("Multiplication: " + cal.multiply(a, b));
        System.out.println("Division: " + cal.divide(a, b));
        System.out.println("Modulo: " + cal.modulo(a, b));

        String s1 = "Jeni";
        String s2 = "Java";
        System.out.println("\nConcatenation: " + str.concatenate(s1, s2));
        System.out.println("Reversed String: " + str.reverse(s1));
        System.out.println("Length of String \"" + s1 + "\": " + str.length(s1));
    }
}
