package Ovningar7Lecture.java;
import java.util.*;

public class Klasslista {
    public static void main(String[] args) {
        
        Set<Student> klasslista = new HashSet<>();
        Student tom = new Student(Tom, 12345, true);
        Student pater = new Student("Pater", 5421, false);
        
        klasslista.add(tom);
        klasslista.add(pater);

        List<Student> klasslistan2 = new ArrayList<>();
        
        klasslistan2.add(tom);
        klasslistan2.add(pater);
        System.out.println(klasslistan2);
    }
    
}
