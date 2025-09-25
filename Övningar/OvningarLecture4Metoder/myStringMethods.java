package OvningarLecture4Metoder;

public class myStringMethods {
    public static String stringReverser(String string) {
        String reverseString = "";

        for (int i = string.length() -1; i >= 0; i--) {
            reverseString = reverseString + string.charAt(i);

        }

        return reverseString;
    }

    public static int charCounter(String string,char pattern) {
        int count = 0;
        for (int i = 0; i < string.length();i ++) {
            if(string.charAt(i) == pattern) count++;
        }
        return count;
    }

    public static boolean emailValidator(String address) {

        if(address.contains("@") != true || address.contains(".") != true) {
            System.out.println("Invalid address, does not contain @ or . ");
            return false;
        }
    }
    
}
