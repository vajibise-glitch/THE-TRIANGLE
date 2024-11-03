package TRIANGLE;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangle: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 of the triangle: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 of the triangle: ");
        double side3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        // Create Triangle object
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Display triangle properties
        System.out.println("\nTriangle details:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
        System.out.println(triangle);
    }
}