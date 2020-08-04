import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Насколько ты древний?");
        int age = scanner.nextInt();
        switch (age){
            case 0: // можно перебирать строки Case "ноль"ys
                System.out.println("Не может быть!");
                break;
            case 7:
                System.out.println("Пиздуй в школу!");
                break;
            case 15:
                System.out.println("Все еще незаконно, но уже хочется");
                break;
            case 25:
                System.out.println("Ты стар");
                break;
            default:
                System.out.println("Ты либо слишком стар, либо недостаточно");
        }
    }
}
