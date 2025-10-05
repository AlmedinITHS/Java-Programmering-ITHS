package EnklaOvningarFranSlide;

public class ArrayerOvningar {
    public static void main(String[] args) {//Olika sätt att deklarera och instansiera nya arrayer
        int [] myIntArray;
        int [] Array = {45,67,100,150,2};

    ArrayerOvningar [] myReferenceArray;

    int myIntArrayC []; //Arraydeklarering typ: C Style, fungerar också.

    int [] myIntArray2 = new int[6];

    ArrayerOvningar [] myReferenceArrayerOvningars = new ArrayerOvningar[3];
    ArrayerOvningar [] newArray = {new ArrayerOvningar("Dino"), new ArrayerOvningar("Anna"), new ArrayerOvningar("Valarie")};


    System.out.println(Array[2]);
    System.out.println(Array[3]);
   

    System.out.println(myIntArray2[5] + " \n");
    
    //Array med variabel-loop ex. 1
    int [] ArrayInALoop = new int[10];

    for (int i = 0; i < 5; i ++) {
        ArrayInALoop[i] = i * i;

        System.out.println(ArrayInALoop);
    
    }
    //Array med loop ex. 2 Loopar referenser till instansieringsobjekten av en klass
    ArrayerOvningar [] newArray2 = new ArrayerOvningar[10];

    for ( int i = 0; i < 3; i++) {
        newArray2[i] = new ArrayerOvningar();

        System.out.println(newArray2 + " \n");
        
    }
    for (int element: Array) { //Skriver ut alla deklarerade värden
        System.out.println(element);
    }
    
}
    
}
