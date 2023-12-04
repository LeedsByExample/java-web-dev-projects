package org.launchcode;
import java.util.Scanner;
public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of a rectangle: ");
        double length = input.nextDouble();

        System.out.println("Please enter rectangle width: ");
        double width = input.nextDouble();

        double area = length * width;
        System.out.println("The area of your rectangle is: " + area);
    }
}
