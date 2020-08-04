package PrimitiveType;

public class Test {
    public static void main(String[] args) {
        float a = 125.56f;
        int c = 123; // из инта в лонг можно, наоборот - ошибка
        long ln = c; // НЕ явное приведение

        long l = 74847L;

        int x =(int) l; // Явное приведение
        System.out.println(x);

        double z = 345.6;
        int q = (int)z;
        System.out.println(q); // теряется все, что после запятой

        byte w = (byte)130;
        System.out.println(w); // уходим в начало числового диапазона, т.к превысили значение
    }
}
