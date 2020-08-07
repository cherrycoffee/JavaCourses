package Serializable;

import java.io.*;
import java.util.Arrays;

public class ReadObject {
    private static Object Person;

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

           //Person person1 = (Person) ois.readObject();
           //Person person2 = (Person) ois.readObject();

            /*

           int personCount = ois.readInt();
           Person[] people = new Person[personCount];

           for(int i = 1; i < personCount; i++){
              people[i] =  (Person) ois.readObject();
           }

             */

            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));

           ois.close();

            //System.out.println(person1);
            //System.out.println(person2);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
