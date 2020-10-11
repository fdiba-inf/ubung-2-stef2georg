package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;

        System.out.println("Circumference: " + perimeter);
        System.out.println("Area: " + area);
    }

}
