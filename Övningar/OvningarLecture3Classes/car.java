package OvningarLecture3Classes;

public class car {
    private String make;
    private String model;
    private String color;
    private int year;

    private car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }
    private car(String make, String model, int year) {
        this(make, model, "Unknown", year);
    }
    private car(String make) {
        this(make, "Unknown", "Unknown", 0);
    }
    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args) {
        car car1 = new car("Toyota", "Camry","Blue", 2010);
        car1.printDetails();
        System.out.println("\n");
        
        car car2 = new car("BMW", "Z3", 2003);
        car2.printDetails();
        System.out.println("\n");

        car car3 = new car("Ford");
        car3.printDetails();
    }



    
}
