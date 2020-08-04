import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

       String separator = File.separator;
        String path =  separator + "Users" + separator + "user563" + separator + "Desktop" + separator + "test.txt";
        File file = new File(path);

        Scanner scanner = new Scanner (file);
        //while (scanner.hasNextLine()){   считываем текст из файла
            //System.out.println(scanner.nextLine()); выводим его на экран
        String line = scanner.nextLine();
        String[] numbers1 = line.split(" ");

        int[] num = new int[5];
        int counter = 0;


        for (String number: numbers1){
           num [counter++] = Integer.parseInt(number);
            }
        System.out.println(num [0]);
        scanner.close();
        }

// если файл лежит в корне проекта, можно не прописывать путь, а просто обраиться к имени файла

        }



