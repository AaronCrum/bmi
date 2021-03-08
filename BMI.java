/* 
 *  Name: Aaron Crum
 *  CSU ID: 2698195 
 *  CIS 265: Homework 3
 *  Description: Please check the Case Study 3.8 of your textbook: Computing the body mass index (BMI) (page 111 in tenth edition). Revise the code to let the user enter weight, feet, and inches instead of just inches and then compute BMI. 
*/

import java.util.Scanner;
public class BMI {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Input height in inches: ");
        double inches = input.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI);
    }
}
