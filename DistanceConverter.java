public class DistanceConverter {
   static double milesToKilometers() {
        double miles = 100;
        double kilometers = miles * 1.609344;
        return kilometers;
    }
    double milesToKilometersNonStatic() {
        double miles = 100;
        double kilometers = miles * 1.609344;
        return kilometers;
    }
    void echoDistanceInKilometers() {
        double miles = 100;
        double kilometers = miles * 1.609344;
        System.out.println(kilometers);
    }
 
    public static void main(String[] args) {
        double distanceInKilometers = milesToKilometers();
        System.out.println(distanceInKilometers);

        DistanceConverter dc = new DistanceConverter();
        double distanceInKilometersNonStatic = dc.milesToKilometersNonStatic();
        System.out.println(distanceInKilometersNonStatic);

        
        
    }
    
}
