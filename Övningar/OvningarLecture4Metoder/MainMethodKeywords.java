package OvningarLecture4Metoder;

public class MainMethodKeywords {
    public static void main(String [] args) {
        System.out.println("main is working fine!");
    }
    //a) Det fungerar

    //b) Private gör så att Huvudmetoden syns inte, 
    //java kommer inte åt klassen så den ger felsymptomet
    //att klassen inte finns

    //c) Jag får felmeddelande om att jag behöver ha keywordet
    //static. Detta har att göra med objekt där, om jag skulle vilja
    // starta mainmetoden som non-static då behöver jag instansiera
    // ett objekt i den. Static innebär att vi startar en metod
    //UTAN att instansiera objekt i metoden.
    
    //d) Void behövs för att mainmetoden returnerar ingenting
    // Hade vi haft en inte behöver vi också returnera ett intvärde
    //för main-metoden.

    //e) Ja, programmet fungerar

    //f) OMG. Har det att göra med det vi skriver koden i två
    //dimensioner?? Det är därför ingen av de andra variabel-
    //typerna fungerar??

    //g) Ja, programmet körs fortfarande om jag flyttar hakparanteserna.
    //(String args [])




}
