package Serializable;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

           Person person1 = (Person) ois.readObject();
           Person person2 = (Person) ois.readObject();

           ois.close();

            System.out.println(person1);
            System.out.println(person2);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
