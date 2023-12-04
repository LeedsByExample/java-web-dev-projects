package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter circle radius: ");

        double radius = input.nextDouble();

        double area = Circle.getArea(radius);

        System.out.println("Your circle area is: " + area);
    }
}