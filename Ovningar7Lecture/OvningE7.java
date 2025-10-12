package Ovningar7Lecture;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class OvningE7 {
    public static void main(String[] args) {

        int[] myArray = new int[5];

        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;

        // Printar ut alla nummer i arrayen
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        SpaceLine();
        int sum = 0;

        // Printar ut summan av alla index i arrayerna
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println(sum);

        SpaceLine();

        // Bra extraövning. Eftersom jag återanvänder variabeln sum så börjar
        // arrayen där den slutade räkna up, dvs 15 och räknar ner för varje indexering
        for (int i = myArray.length - 1; i >= 0; i--) {
            sum -= myArray[i];
            System.out.println(sum);
        }

        SpaceLine();

        // Array skriver ut i omvänd ordning, dvs räknar ner
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }

        SpaceLine();

        // B1 Exercise

        ArrayList<String> myListOfColors = new ArrayList<>();

        myListOfColors.add("Blue");
        myListOfColors.add("Red");
        myListOfColors.add("Green");
        System.out.println(myListOfColors);

        myListOfColors.remove("Green");
        System.out.println(myListOfColors);

        SpaceLine();
        
        // B2 Exercise

        Set <Integer> mySetList = new HashSet<>();

        mySetList.add(1);
        mySetList.add(2);
        mySetList.add(2);
        mySetList.add(3);
        mySetList.add(3);
        mySetList.add(3);

        System.out.println(mySetList);

        SpaceLine();

        mySetList.size();

        System.out.println(mySetList.size());

        //A Set is a collection that does not allow duplicate elements.
        //A HashSet, in particular, uses a hashing mechanism to check 
        //if an element already exists.

        SpaceLine();

        //B3 Exercise

        Queue <String> turOrdning = new LinkedList<String>();

        turOrdning.add("Marina");
        turOrdning.add("Herbert");
        turOrdning.add("Jaque");

        System.out.println(turOrdning.poll());

        turOrdning.add("Edin");

        System.out.println(turOrdning);
        System.out.println(turOrdning.peek());

        SpaceLine();

        //I1 Exercise

        ArrayList<Integer> intNumbers = new ArrayList<>();
        
        for(int i = 0; i <= 10; i ++) {
            intNumbers.add(i);
        }
        System.out.println(intNumbers);

        










    }
    

    public static void SpaceLine() {
        System.out.println("\n");
    }

    /*public static void CheckBlueColor() {
        if (myListOfColors.contains("Blue")) {
            System.out.println("\"blue\" is in the list");
        } else {
            System.out.println("\"blue\" is not in the list");
        }*/

    }


