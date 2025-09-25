package OvningarLecture4Metoder;

import java.util.Scanner;
import OvningarLecture4Metoder.*;

public class GeometryTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle1 = new Circle();
        System.out.println("Enter circle radius");
        circle1.setRadius(scanner.nextDouble());
        System.out.println("The area of the circle radius " + circle1.getRadius() + " is: " + String.format("%.2f", circle1.computeArea()));
        System.out.println("The circumference of a circle of radius " + circle1.getRadius() + " is " + String.format("%.2f", circle1.computeCircumference()));

        Rectangle rektangel1 = new Rectangle();
        System.out.print("Enter the rectangle height: ");
        rektangel1.setA(scanner.nextDouble());
        System.out.print("Enter the rectangle width: ");
        rektangel1.setB(scanner.nextDouble());

        System.out.println("The are of a rectangle with height " + rektangel1.getA() + " and width " + rektangel1.getB() + " is " + String.format("%.2f", rektangel1.computeArea()));
        System.out.println("The perimeter of a rectangle with the height " + rektangel1.getA() + " and width " + rektangel1.getB() + " is: " + String.format("%.2f",rektangel1.computePerimeter()));


    }
    
}
