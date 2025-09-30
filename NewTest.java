
public class NewTest {
    String make;
    String model;
    int year;
    String colour;

    public NewTest(String make, String model, int year, String colour) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }
    public NewTest(String make, String model, int year) {
        this(make, model, year,"Unknown");
    }
    public NewTest(String make) {
        this(make, "Unknown", 0, "Unknown");
    }
public void printDetails() {
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Colour: " + colour);
}
public static void newLine() {
    System.out.println("\n");
}



    
            
    
    public static void main(String[] args) {
        NewTest car1 = new NewTest("BMW", "Z4", 2002, "silver");
        car1.printDetails();

        newLine();

        NewTest car2 = new NewTest("Mercedes", "SLK", 1998, "Blue");
        car2.printDetails();

        newLine();

        NewTest car3 = new NewTest("Mercedes","Unknown", 0,"Silver");
        car3.printDetails();
        
        
        
        
        
    }
}
    

