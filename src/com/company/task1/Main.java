package com.company.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Radius: ");
        double x = scanner.nextDouble();
        System.out.print("Input Side: ");
        double y = scanner.nextDouble();
        Circle circle = new Circle(x);
        Square square = new Square(y);

        System.out.println("Circle's area is equal to: " + circle.getArea() + " ,and the perimeter is equal to: " + circle.getPerimeter());
        System.out.println("Square's area is equal to: " + square.getArea()+ " ,and the perimeter is equal to: " + square.getPerimeter());
    }
}
