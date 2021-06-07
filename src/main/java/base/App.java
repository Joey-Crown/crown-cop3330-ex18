/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package base;

import java.util.Scanner;

/* Exercise 18 - Temperature Converter
You’ll often need to determine which part of a program is run based on user input or other events.
Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the
starting temperature. The program should prompt for the type of conversion and then perform the conversion.

The formulas are

C = (F − 32) × 5 / 9
and
F = (C × 9 / 5) + 32

Example Output

Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.

Constraints

Ensure that you allow upper or lowercase values for C and F.
Use as few output statements as possible and avoid repeating output strings.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value
entered is not numeric.
Break the program into functions that perform the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.
Modify the program so it also supports the Kelvin scale.


*/
public class App 
{
    static double temperature;

    public static void main( String[] args )
    {

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        Scanner number1 = new Scanner(System.in);
        Scanner string = new Scanner(System.in);

        // input Fahrenheit or Celsius
        String cOrF =  string.nextLine();
        System.out.println("Your Choice: " + cOrF);

        // calculating for F to C
        if (cOrF.equals("C") || cOrF.equals("c")) {
            // input temperature
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temperature = number1.nextDouble();
            temperature = (temperature - 32) * (5.0 / 9.0);
            System.out.printf("\nThe temperature in Celsius is %.1f.", temperature);
        }

        // calculating for C to F
        else if (cOrF.equals("F") || cOrF.equals("f")) {
            // input temperature
            System.out.print("Please enter the temperature in Celsius: ");
            temperature = number1.nextDouble();
            temperature = (temperature * (9.0 / 5.0)) + 32;
            System.out.printf("The temperature in Fahrenheit is %.1f.", temperature);
        }
        else {
            System.out.println("Invalid input");
        }

    }

}
