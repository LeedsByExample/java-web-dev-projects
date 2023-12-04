package org.launchcode;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        double miles = input.nextDouble();

        System.out.println("Enter gallons of gas consumed: ");
        double gas = input.nextDouble();

        double milesPerGallon = miles/gas;
        System.out.println("Your miles per gallon equals: " + milesPerGallon);
    }
}
//Write a program that asks a user for the number of miles they have driven and the amount of gas they’ve consumed (in gallons), and print their miles-per-gallon.