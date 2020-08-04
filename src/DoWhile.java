import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Введите 5"); Дублирование кода, это не хорошо
        int value = scan.nextInt();
        while (value != 5){
            System.out.println("это не 5, говна кусок"); Вот оно
            value = scan.nextInt();

        }*/
        int value;
        do{
            System.out.println("Дай 5!");
            value = scan.nextInt();
        } while (value != 5);
        System.out.println("Збц, 5");
    }
}
