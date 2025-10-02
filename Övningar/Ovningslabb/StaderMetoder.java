package Ovningslabb;

public class StadArray {
    StadArray [] stad = new StadArray [3]; 

    stad [0] = "Göteborg";
    stad [1] = "Malmö";
    stad [2] = "Östersund";
    stad [3] = "Umeå";
    
    for (int i = 0; i < stad; i++) {
        stad++;
    }

    System.out.println(stad[0]);

    public enum Veckodagar {
        MÅNDAG,
        TISDAG,
        ONSDAG,
        TORSDAG,
        FREDAG,
        LÖRDAG,
        SÖNDAG;
    }
     Random rand = new Random();
    int degree = rand.nextInt(30) -5;

    String [] weather = new String [5];
    weather [0] = "soligt";
    weather [1] = "";
    weather [2] = "soligt";
    weather [3] = "soligt";
    weather [4] = "soligt";
    weather [5] = "soligt";
}
