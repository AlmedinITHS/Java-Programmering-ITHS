package Ovningslabb;

import java.util.Random;
//ChatGPT version väderstation
public class Vaderastation2 {
     
    public static void main(String[] args) {
         String [] stader = {"Östersund", "Göteborg","Malmö", "Umeå"};
        
        int manad = 
        String arstid = getArstid(manad);


        System.out.println("Månad: " + manad);
        System.out.println("Årstid: " + arstid);
        System.out.println("\nVäderrapport: ");

        for(String stad : stader) {
            int temp = slumpaTemperatur(arstid);
            System.out.println(stad + ": " + temp + " grader celsius");
        }

    }

    public static String getArstid(int manad) {
        if (manad == 12 || manad == 1 || manad == 2) {
            return "Vinter";
        }
        else if (manad >= 3 && manad <= 5) {
            return "vår";
        }
        else if (manad >= 6 && manad <= 8) {
            return "Sommar";
        }
        else {
            return "Höst";
        }
    }
    public static int slumpaTemperatur(String arstid) {
        Random rand = new Random();

        if (arstid.equals("Vinter")) {
            return rand.nextInt(31) - 25;
        }
        else if (arstid.equals("Vår")) {
            return rand.nextInt(16);
        }
        else if (arstid.equals("Sommar")) {
            return rand.nextInt(16) + 15;
        }
        else {
            return rand.nextInt(11);
        }

    }
    
}
