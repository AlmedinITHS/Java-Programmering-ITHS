package OvningarLecture3Classes;

public class book {
    String title; //Attribut (Beteenden och egenskaper)
    String author; 
    int year;

    public book () { //Konstruktor(Egentligen en metod) för skapat objekt, 
                    //måste vara samma namn som klassen
        title = "La carte et le territoire";
        author = "Michel Houellebec";
        year = 2011;
    }
    public void printDetails() { //Metod för att skriva ut följande
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args) {
        book book = new book(); //new book är objektet
        book.printDetails();//Argument av objektet bok,
        //Anropar printDetails att skriva ut informationen

    }
}

    


    

    


