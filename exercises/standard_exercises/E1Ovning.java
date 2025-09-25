public class E1Ovning { //Namnet på filen
    public static void main (String [] args) {
        //1.1
        String a;
       // int myAge;
        //myAge = 36;

        int myAge = 36;
        //1.2
        String myFirstName;
        myFirstName = "Max";

        String myFirstName2 = "Max";

        //1.3
        System.out.println("My name is " + myFirstName + " and I am " + myAge);
        //1.4
        boolean theTruth = false;
        System.out.println(theTruth);
        //1.5
        int x = 256;
        byte y = 8;
        System.out.println(x);
        System.out.println(y);

        x = y; // funkar, men inte y = x pga att det inte går att typecast-konvertera
        System.out.println(x);
        //1.6
        int numberOfStudents = 23; //Ja
        char classroomIdentifier = 'B';//Ja
        //int backgroundColor = "blue"; // Nej
        //boolean above50%; // Nej
        //boolean isNative = 0; // Nej
        String exampleString = "This is an example string"; //Ja
        //int gravitationalForce = 9.82; //Nej
        double gravitationalForceD = 9.82; //Ja
        //byte screenResolutionX = 1024; //Nej
        char smileyFace = '\u263a'; //Unicode, Ja

        //1.7

        /*a. The calypso variable is of type Ship 
        
        b. It is a two-part statement. 
        The left-hand side of the @ designates the type of the object that is referenced. 
        The right-hand side contains the reference itself, a series of 8 alpha-numerical 
        characters*/

        //1.8
        //a
        x = 8;
        y = 24;
        //b
        int x3 = 4;
        short y3 = 12; 
        // Yes, it's a valid variable declaration statement because 12 fits
        // in a 16 bit integer variable, which is called short 

        //1.10
        int a1 = 10, b = 20, c = 30;
        int average = (a1 + b + c)/3;

        System.out.println(" The average is " + average);
        //1.11 a.

        boolean isRaining = true;
        boolean isCold = true;//b.false
        if (isRaining == true && isCold == true) {
            System.out.println("Stay inside");
        }
        else {
            System.out.println("You can go outside");
        }
        










        




    }
}