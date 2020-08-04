package AnonimClasses;
interface AbleToEat{
    public void eat();
}




public class Test {
    public static void main(String[] args) {
AbleToEat ableToEat = new AbleToEat() {  // обьект интерфейса не создается, создается класс,
                                         // который реализует интерфейс
    @Override
    public void eat() {
        System.out.println("Someone is eating...");
    }
};
ableToEat.eat();
    }
}
