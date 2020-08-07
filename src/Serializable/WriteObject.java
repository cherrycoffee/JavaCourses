package Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

       // Person person1 = new Person(1,"Biba");
        //Person person2 = new Person(2, "Boba");
        Person[] people = {new Person(1,"Biba"),new Person(2, "Boba"), new Person(3,"Karas") };

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //oos.writeInt(people.length);

            /*


            for(Person person : people){
                oos.writeObject(person);
            }

             */

            //oos.writeObject(person1);
            //oos.writeObject(person2);
            oos.writeObject(people);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
