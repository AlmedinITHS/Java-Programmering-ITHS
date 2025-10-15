package OvningarLecture6InheritanceInterfaceAndAbstractClasses;

import java.util.Scanner;
import java.util.Random;

public class Bil extends Fordon {
    public int price;
    
   public  Bil(int price, int weightInKg) {
       price = 200000;
       weightInKg = 900;
   
   }
   public void driveCar() {
    for(int i = 0; i < 200; i++) {
        System.out.println(i);


    }
   }
    
    
    
}

