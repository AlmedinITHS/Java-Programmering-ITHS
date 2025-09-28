package OvningarLecture5Arrayer;

public class PrintarPlaneter {
    public static void main(String[] args) {
        for (Planeter p : Planeter.values()) {
            System.out.println(p.name());
        }
        
    }
    
}
