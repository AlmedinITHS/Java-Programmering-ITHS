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
        
        for(int i = 0; i < numbers.size(); i++) {
           if (numbers.get(i) % 2 == 0) {
            numbers.remove(i);
           }
           
           System.out.println("Removed all even numbers: "  + numbers);
        }
        

        //public static void doubNumbers(ArrayList <Integer> numbers, int x2) {
          //  int numbers * x2};



        

    }
    
}
