package ObjectComparison;

public class Test {
    public static void main(String[] args) {
Animal animal1 = new Animal(1);
Animal animal2 = new Animal(1);

        System.out.println(animal1 == animal2); // сравниваются ссылки на обьекты, а не сами обьекты
        System.out.println(animal1.equals(animal2));// тоже сравнивает ссылки
        // Для сравнения обьектов, необходимо переопределить метод equals

        String string1 = "some text";
        String string2 = "some text";
        // две эти переменных ссылаются на один обьект
    }

}
 class Animal{
    private int id;

    public Animal(int id){
        this.id = id;
    }

    public boolean equals(Object obj){
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
 }
