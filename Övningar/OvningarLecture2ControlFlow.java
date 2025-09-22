public class OvningarLecture2ControlFlow {
    public static void main(String[] args) {
        //a
        int x = 3, y = 8;
        if (x < y) {
            y = x + y;
        }
        else {
            y = y - x;
        }
        System.out.println(y);


        //b
        x = 12; y = 200;
        if (x == y) {
            y = 80;
        }
        else {
            y = x;
        }
        System.out.println(y);

        //c
        x = 12; y = 0;
        y = x * x - 2 * x + 30;
        if(x < y) {
            x = 1;
        }
        else {
            y = 0;
        }
        System.out.println(y);
    }

}