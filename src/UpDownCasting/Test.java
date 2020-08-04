package UpDownCasting;

public class Test {
    public static void main(String[] args) {
   Dog dog = new Dog();

    // Upcasting
     Animal animal = dog;

     //Downcasting
        Dog dog2 = (Dog)animal;
        dog2.bark();

        Animal a = new Animal();
        Dog dog3 = (Dog)a;
        dog3.bark();
    }
}
