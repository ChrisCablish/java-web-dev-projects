package org.launchcode;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle:");
        double length = input.nextDouble(); // Convert input to double

        System.out.println("What is the height of the rectangle:");
        double height = input.nextDouble(); // Convert input to double

        double area = length * height;
        System.out.println("The area of the rectangle is: " + area);
    }
}

