package Ovningar7Lecture;

import java.util.ArrayList;

public class OvningE7Intermediate {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i <= 10; i ++) {
            numbers.add(i);
        }
        System.out.println("Original list: " + numbers);

        
        removeEvenNumbers(numbers);





        
    }
    public static void removeEvenNumbers(ArrayList <Integer> numbers) {
        
        for(int i = 10; i >= 0; i--) {
           if (i % 1 != 0) {
            numbers.remove(i);
           }
           System.out.println("Removed all even numbers: "  + numbers);
           
        }

    }
    
}
