package OvningarLecture5Arrayer;

import java.util.Arrays;
import java.util.Random;
public class ArrayAvInteger {
    int [] integerArray;

    public ArrayAvInteger(int i) {
        integerArray = new int[i];
        Random r = new Random();

        for(int element = 0; element < integerArray.length; element++) {
            integerArray[element] = r.nextInt(1000);
        }
    }
    void substitute(int index, int newValue) {
        integerArray[index] = newValue;
    }
    void square(int index) {
        integerArray[index] = integerArray[index] * integerArray[index];
    }

    public static void main(String[] args) {
        ArrayAvInteger myArray = new ArrayAvInteger(10);

        System.out.println(Arrays.toString(myArray.integerArray));

        myArray.substitute(4,999);

        System.out.println(Arrays.toString(myArray.integerArray));

        myArray.square(3);

        System.out.println(Arrays.toString(myArray.integerArray));
    }
}
