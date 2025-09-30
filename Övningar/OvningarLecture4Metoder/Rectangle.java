package OvningarLecture4Metoder;

public class Rectangle {
    private double a;
    private double b;

    public double calculateArea() {
        double area = a * b;
        return area;
    }
    public double calculatePerimeter() {
        double perimeter = a*2+b*2;
        return perimeter;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
}
