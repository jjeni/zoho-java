package Assignment9;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            System.out.println("YOU ARE GOING TO SET YOUR ATM PIN, PLEASE READ CAREFULLY BEFORE SETTING PIN");
            System.out.println("---> It must be exactly 4 digits long.");
            System.out.println("---> It should contain only numeric characters.");
            System.out.println("---> It must not start with 0.");
            System.out.print("Enter your 4-digit ATM PIN: ");

            String pin = sc.next();
             try {
                validPin(pin); 
                System.out.println("PIN is valid and set successfully!");
                valid = true;
            } catch (InvalidPinException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void validPin(String pin) throws InvalidPinException{
        if(pin.length()!=4){
            throw new InvalidPinException("Pin Length Must be 4.");
        }
        
        for(char c:pin.toCharArray()){
            if(!Character.isDigit(c)){
                throw new InvalidPinException("Please, Enter a Valid Digit.");
            }
        }

        if (pin.charAt(0) == '0') {
            throw new InvalidPinException("PIN must not start with 0.");
        }
    }
    
}

class InvalidPinException extends Exception{
    public InvalidPinException(String m){
        super(m);
    }
}