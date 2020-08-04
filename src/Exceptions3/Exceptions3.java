package Exceptions3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args)  {
        // Checked exception -- возникают во время компиляции
        // Unchecked exception -- возникают во время выполнения кода
        /*
        File file = new File("test");
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Привет, Андрей");
        }
        Пример checked
         */

        //int a = 1/0; -- нельзя делить на 0

        /*
        String name = null;
        name.length();
        Это NullPointerException
         */
        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
