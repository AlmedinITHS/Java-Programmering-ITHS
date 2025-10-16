package Ovningslabb;

public class NewTest1 {
    public static void main(String[] args) {

        int num = 10, result = 0;
        do {
            result = result + num * num;
            num++;
        }
        while (num <= 4);

        System.out.print(result);
        
        
    }
}
