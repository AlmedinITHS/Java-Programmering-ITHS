package Ovningslabb;

import java.util.Random;
public class StaderMetoder {
 
 
  public  String[] valdCity(){    
   String[] city = new String[4];
  city [0] =  "Malmö";
  city [1] = "Göteborg";
  city [2] = "Umeå";
  city [3] = "Stockholm";
 
 
  for (int i = 0; i < city.length; i++){
 
      System.out.println("- " + city[i]);
  }
   
    return city;
   }
   
   public String[] vecka(){
    String[] dag = new String[7];
    dag [0] ="Måndag";
    dag [1] ="Tisdag";
    dag [2] ="Onsdag";
    dag [3] ="Torsdag";
    dag [4] ="Fredag";
    dag [5] ="Lördag";
    dag [6] ="Söndag";
 
    return dag;
   }
 
    public int temp (){
    Random rand = new Random();
    int degree =rand.nextInt( 20) -5;
    return degree;
    }
   
 
    public String väder(){
      String[] weather = new String[5];
    weather [0] =  "soligt";
    weather [1] = "molnigt";
    weather [2] = "regningt";
    weather [3] = "snöigt";
    weather [4] = "blandat mellan sol och molnigt";
    Random we =new Random();
    int wh = we.nextInt(weather.length);
    String weat = weather [wh];
    return weat;
 
  }
}
