package OvningarLecture4Metoder;

public class Circle {
    private double radius;

    public double CalculateArea() {
        double area = radius * radius * Math.PI;
        return area;
    }
    public double CalculateCircumference() {
        double circumference = radius * 2 * Math.PI;
        return circumference;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
