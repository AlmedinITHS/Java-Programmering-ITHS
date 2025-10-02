package Ovningslabb;

import java.util.Scanner;
 
public class Vaderstation {
 
    public static void main(String[] args) {
   
       
        System.out.println("Hej! I vilken av följande städer vill du veta hur vädret är? :)");
        System.out.println(" Skriv stadens namn");
       
        StaderMetoder valdStad = new StaderMetoder();
        String vs[] = valdStad.valdCity();
       
        Scanner s = new Scanner(System.in);
        String choseCity = s.nextLine();
         System.out.println("Du har valt staden " + choseCity);
         System.out.println("För vilken dag vill du veta hur vädret kommer bli?");
 
        String dag =s.nextLine();
 
        StaderMetoder valdVeckodag = new StaderMetoder();
        String  vd [] =valdVeckodag.vecka();
 
        StaderMetoder grader = new StaderMetoder();
        int gd = grader.temp();
 
        StaderMetoder OK = new StaderMetoder();
        String väd = OK.väder();
         
 
        System.out.println("Vädret för " + choseCity + " på " +  dag + " kommer att vara " + gd + " grader och " + väd);
        s.close();
    }
   
}
