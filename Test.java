import java.util.Set;//Interface
import java.util.HashSet;//Class
import java.util.List;
//Vill man ha med allting, ta med stjärnan *
public class Test {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0)
            System.out.println(i);
        }
        int num = 2;
        while (num <= 20) {
            System.out.println(num);
            num += 2;
        }
        int number = 5;
        for (int i= 1; i < 50; i ++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        
    
        int [] numbers = new int [10];

        for (int i = 0; i < 10; i ++) {
            numbers[i] = i + 1;
        }
        for(int j = 1; j < 10; j++) {
            System.out.println(numbers[j]);
        }
        for(int k : numbers) {
            System.out.println(numbers[k-1]); //Denna enhancedloopen börjar på 1, därför
                                              //Måste jag skriva k-1 så att den börjar på
        }                                     //0
    }

    
}
