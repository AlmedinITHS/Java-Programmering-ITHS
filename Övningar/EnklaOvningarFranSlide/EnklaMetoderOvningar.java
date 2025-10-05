package EnklaOvningarFranSlide;

public class EnklaMetoderOvningar {
     static double milesToKilometers() {
        double miles = 100;
        double kilometers = miles * 1.609344;
        return kilometers;
    }
       
    
    double milesToKilometer(double miles) {
        double kilometers = miles * 1.609344;
        return kilometers;
    }
    static void EchoDistanceInKilometers() {
        double miles = 100;
        double kilometers = miles * 1.609344;
        System.out.println(kilometers);
    }
    public static void main(String[] args) {
        

        double distanceInKilometers = milesToKilometers();
        System.out.println(distanceInKilometers);

        double twoPowerOfFour = Math.pow(2, 4);
        System.out.println(twoPowerOfFour);

        EchoDistanceInKilometers();
       
        

        

        
         
    }
    
}
