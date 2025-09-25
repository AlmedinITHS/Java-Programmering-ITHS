package OvningarLecture3Classes;

public class Main {
    public static void main(String[] args) {
        Flygplats flygplats = new Flygplats();

        flygplats.Boeing.maxPassagerare = 345;
        flygplats.Boeing.NosTillBakvinge = 80;
        flygplats.Boeing.modell = "Boeing 747";

        System.out.println("Välkommen till " + flygplats.name);
        System.out.println("Följande flygplan är på flygplatsen: ");

        System.out.println(flygplats.Embraer.modell);
        System.out.println(flygplats.Boeing.modell);

        Flygplan flygbuss = new Flygplan();
        flygbuss.maxPassagerare = 544;
        flygbuss.NosTillBakvinge = 150;
        flygbuss.modell = "Airbus A300";

        Flygplan EnTillBoeing = new Flygplan();

        System.out.println("Det finns två flygplan till utanför flygplatsen");

        System.out.println(flygbuss.modell);
        System.out.println(EnTillBoeing.modell);

        flygplats.Boeing.modell = "Boeing 777-300";

        System.out.println(flygplats.Boeing.modell);
        System.out.println(EnTillBoeing.modell);





        
    }
}