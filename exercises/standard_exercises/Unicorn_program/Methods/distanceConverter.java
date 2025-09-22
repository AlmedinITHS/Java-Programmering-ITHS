package Unicorn_program.Methods;

public class distanceConverter {
    public static void main(String[] args) {
        milesToKilometers(3.68);
        milesToKilometers(4.7);
        milesToKilometers(6.75);
        milesToKilometers2();
    }
    static void milesToKilometers2() {
        double miles = 100;
        double kilometers = miles * 1.60934;
        System.out.println(kilometers);
    }
    static void milesToKilometers(double miles){
        
        double kilometers = miles * 1.60934;

        System.out.println(kilometers);
    }
    
}
