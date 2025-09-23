public class OvningarLecture2ControlFlow {
    public static void main(String[] args) {
        

        //2.4 Uppgifter
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        
        int CountEvenNumbers = 0;
        while (CountEvenNumbers <= 20) {
            CountEvenNumbers++;
            if (CountEvenNumbers % 2 != 0)
            continue;
            System.out.println(CountEvenNumbers);
        }

        int multiplicationTable = 5;
        for (int i = 0; i <= 10; i++) {
            int result = multiplicationTable* i;
            System.out.println(result);
        }

        int countDown = 11;
        while (countDown > 1) {
            countDown--;
            System.out.println(countDown);
        }

        int sum = 0;
        for(int i = 0; i < 11; i++) {
            sum = sum+ i;
            if(i % 2 == 0)
            continue;
            System.out.println(sum);
        }






    }

}