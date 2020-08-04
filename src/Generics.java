import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        SomeAnimal dick = new SomeAnimal();
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = animals.get(0);
    }

}
class SomeAnimal {

}