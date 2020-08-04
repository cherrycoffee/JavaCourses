package Exeption1;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exeptions1 {
    public static void main(String[] args) {
        File file = new File("hhgh");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("тут тоже все выполняется, если нет исключения");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println("дальше как обычно");
        // если в методе обрабатывем исключение, то и при вызове метода надо

        // Желательно обрабатывать все исключения, т.к трейс ошибки который есть - это не ок
    }
}
