package Polimorf;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();// возможно благодаря наследованию
        //animal.eat(); -- Вызовется переопределенный метод в Dog
        //animal.bark(); -- этот метод недоступен, т.к не принадлежит к родительскому классу
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Animal animal1 = new Animal();
        Cat cat = new Cat();
        test(animal);
        test(dog);// можем вызывать, так Dog наследуется от Animal
        test(cat);


    }
    public static void test(Animal animal){
        animal.eat();

    }
}
