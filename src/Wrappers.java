public class Wrappers {
    public static void main(String[] args) {

        // Double, Float, Long, Integer, Short, Byte, Character, Boolean
        int x = 1;
        Integer x2 = 123; // Самоупаковка == new Integer (123);
        int y = x2;  // Самораспаковка
        Integer.parseInt("123");


    }
}
