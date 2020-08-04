package Exceptions4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args)  {
        try {
            run();
        } catch (Exception e) {



        //catch (IOException  | ParseException e) { -- мультикетч
            //e.printStackTrace();
        }


    }
    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
// Все исключения в джаве наследуются от Exceptions. Можно ловить и выбрасывать несколько исключений в одном методе.