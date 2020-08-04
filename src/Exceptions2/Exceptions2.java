package Exceptions2;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws ScannerExceptions {
        Scanner scanner = new Scanner(System.in);
        while (true){
           int x =  Integer.parseInt(scanner.nextLine());

           if(x != 0){
               /*
               try {
                   throw new IOException(); можно добавлять в сигнатуру метода, а можно через трай кетч
               } catch (IOException e) {
                   System.out.println("tru-tu-ty");
               }

                */
               throw new ScannerExceptions("Пользователь ввел что-то кроме нуля");
           }
        }
    }
}
