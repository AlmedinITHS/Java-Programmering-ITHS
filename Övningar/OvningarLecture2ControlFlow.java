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
        for(int i = 0; i <= 10; i++) {
            
            if(i % 2 != 0) {
            sum = sum+ i;
            System.out.println(sum);
        }
     } // Vf får jag värden i dubbletter?
        
        //2.1 extra
        int a = 5, b = 10;
        if ( a > b) {
            b = a * b;
        } 
        else {
            a = a + b;
        }
        System.out.println("a: " + a + " b: " + b);

        int p = 15, q = 10;
        if (p >= q) {
            q = p - q;
        }
        else {
            p = q - p;

        }
        System.out.println("p: " + p + " q: " + q);
        
        int m = 0, n = 6;
        if (m == n) {
            n = n * 2;
        }
        else {
           m = m * n;
        }
        System.out.println(m);

        int i = 4, j = 12;
        if(i != j) {
            j = j / i;
        }
        else {
            i = i % j;
        }
        System.out.println(j);

        int c = 7, d = 2;
        if (c < d) {
            d = c % d;
        }
        else {
            c = c / d;
        }
        System.out.println("c: " + c + " d: " + d);

        int e = 25, f = 30;
        if (e <= f) {
            f = f - e;
        }
        else {
            e = e + f;
        }
        System.out.println("e: " + e + " f: " + f);








    }

}