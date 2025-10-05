package EnklaOvningarFranSlide;

import java.util.Arrays;

public class WalrusArrayer {
    public static void main(String[] args) {
        WalrusArrayer [] myWalruses = new WalrusArrayer[10];
        System.out.println(myWalruses.length);
    
        System.out.println("\n");

    int [] myArray = {1,56,78,150,25,122};
    int element = 0;

    while (element < myArray.length) {
    System.out.println(myArray[element]);
    element++;
    }
    Arrays.fill(myArray,0,5,1);//Fyller en array med 1:or mellan 3 och 5.
    System.out.println(myArray[element]);

    Arrays.sort(myArray);//Sorterar en array i ordning från minsta värdet till största värdet
    System.out.println(myArray[element]);

    Arrays.binarySearch(myArray,45);//Söker efter värdet 45 i en sorterad array
    System.out.println(myArray[element]);

    Arrays.copyOf(myArray, 100);// Skapar en kopia av en array med längden 100. CopyOf förkortar eller förlänger arrayen automatiskt
    System.out.println(myArray[element]);

    int [] myOtherArray = {56,89,81,4};

    Arrays.equals(myArray,myOtherArray);//Returnerar true om och endast om myArray och myOtherArray är exakt likadana
    System.out.println(myArray[element]);

    Arrays.toString(myArray);//Returnerar en String representation av en array. Praktisk för att printa ut arrayer i terminalen
    System.out.println(myArray[element]);
    
    int [][] MultipleDimensionsArray = new int [3][3]; // Här skapas en array som har nio värden i ett 3x3 rutnät. Inom matematiken kallar
                                                       //man det här för matriser. Rent praktiskt implementeras det här som en array av arrayer.
                                                       //Det är alltså en array med tre olika arrayer inuti.
    }


    
}
