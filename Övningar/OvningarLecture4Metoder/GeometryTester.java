package OvningarLecture4Metoder;

import java.util.Scanner;
import OvningarLecture4Metoder.*;

public class GeometryTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Circle circle = new Circle();

        System.out.print("Enter circle radius: ");
        circle.setRadius(scan.nextDouble());
        System.out.println("The area of the cirle radius " + circle.getRadius() + " is " + circle.ComputeArea());
        System.out.println("The circumference of the circle radius " + circle.getRadius() + " is " + circle.ComputeCircumference());

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle height: ");
        rectangle.setA(scan.nextDouble());
        System.out.println("Enter rectangle width: ");
        rectangle.setB(scan.nextDouble());

        System.out.println("The area of the rectangle with the height " + rectangle.getA() + " and width " + rectangle.getB() + " is: " + rectangle.calculateArea());
        System.out.println("The perimeter of a rectangle with the height" + rectangle.getA() + " and width " + rectangle.getB() + " is: " + rectangle.calculatePerimeter());

        scan.close();




    }
    
}
