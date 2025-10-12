package PolymorfismEgenOvning.PolymorfismUppgift.Uppgift1;

 public interface Ager {

    public class Fordon implements Ager{
      public void Aga(String namnAgare) {
         System.out.println("Fordonet ägs av: " + namnAgare);
      }

    }

    

 }
