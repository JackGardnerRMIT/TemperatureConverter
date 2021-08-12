//import scanner to get user input

import java.util.Scanner;

//create program class

public class program{
    public static void main(String[] args) {

        //asks question and gets values

        System.out.print("Please enter the temperature (e.g., 10.0 C or 28.0 F): ");        
        Scanner scan = new Scanner(System.in);  
        
        //get input and variables for input calculations

        double temperature = scan.nextDouble();
        String type = scan.next();

        //if statements to first sort the measurement type, then calculate the conversion and print the result

        if(type.equals("C")) {
            double celsiusConverted = temperature * 9 / 5 + 32;
            System.out.printf("The converted temperature is: %.2f", celsiusConverted);
        } else if(type.equals("F")) {
            double fahrenheitConverted = (temperature - 32) * 5 / 9;
            System.out.printf("The converted temperature is: %.2f", fahrenheitConverted);
        } else {
            System.out.println("Please retry your entry.");
        }
    }
}