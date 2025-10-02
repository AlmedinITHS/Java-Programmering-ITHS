package Ovningslabb;
import java.util.Random;

public class SlumpaTemp {
    public static int slumpaTemp(int minTemp, int maxTemp) {
        Random randTemp= new Random();
        return randTemp.nextInt(maxTemp - minTemp + 1) + minTemp;
    }
    
    
}
