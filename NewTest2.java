import java.util.Scanner;

public class NewTest2 {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();

    int reversed = 0;

    while (num != 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }
    System.out.println(reversed);
    int num2 = 5/10;
    System.out.println(num2);
    }

    

}
