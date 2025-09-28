package OvningarLecture5Arrayer;

import java.util.Date;
import java.util.Arrays;

public class ArrayAvDatum {
    public static void main(String[] args) {
        
        Date [] myDateArray = new Date[3];

        myDateArray[0] = new Date(455598232523L);
        myDateArray[0] = new Date(302233435892L);
        myDateArray[0] = new Date(927680203505L);

        for(Date d : myDateArray) {
            System.out.println(d.toString());
        }

        Arrays.sort(myDateArray);

        for (Date d : myDateArray) {
            System.out.println(d.toString());
        }
        long diff = myDateArray[2].getTime() - myDateArray[0].getTime();

        System.out.println("The difference between the longest and the shortest date is " + diff);

        long diffDays = diff/1000/60/60/24;

        System.out.println("Which translates to " + diffDays + " days!");
    }
    
}
