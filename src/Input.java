import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        String str = new String("Hello"); // java.lang
        Scanner s = new Scanner(System.in);// java.util
        System.out.println("Введите что-нибудь ");
        String string = s.nextLine();
        System.out.println("вы ввели " + string);
        System.out.println("Введите число ");
        int x = s.nextInt();
        System.out.println("Вы ввели "+ x);
    }
}
