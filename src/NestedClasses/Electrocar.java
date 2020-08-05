package NestedClasses;

public class Electrocar {
    private int id;

    private class Motor {   // нестатический вложенный класс
        public void startMotor(){
            System.out.println(" Motor" + id + " is starting");
        }

    }

    // статический вложеный класс -- не имеет доступа к полям обьекта(только к статическим)
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging");
        }
    }

    public Electrocar(int id){
        this.id = id;
    }

    public void start(){

       // классы в методе -- имеет доступ к полям обьекта и к переменным в методе(если переменные константы)
        class SomeClass{
            public void someMethod(){

            }

        }
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar "+ id + " is starting");
    }
}
