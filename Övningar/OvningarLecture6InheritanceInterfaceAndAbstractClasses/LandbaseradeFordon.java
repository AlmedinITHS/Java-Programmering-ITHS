package OvningarLecture6InheritanceInterfaceAndAbstractClasses;

public class LandbaseradeFordon extends Fordon {
    

    public static void main(String[] args) {
         LandbaseradeFordon bil = new LandbaseradeFordon(5000);
         bil.price;
         bil.speedometer;
         LandsbaseradeFordon motorcykel = new LandbaseradeFordon(200);
    }

    LandbaseradeFordon (int price) {
        this.price = price;
    }

    
    public void runVehicle(){
        for(int i = 0; i < 240;i++) {
            System.out.println(i);
        }

    }
    
}
