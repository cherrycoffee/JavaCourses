public class ClassesAndObjects {
    public static void main(String[] args) {
      Person person1 = new Person();
      person1.setData("Vova",39);

      //String s1 = "Vova"; так тоже можно передать параметр в метод
      //person1.setName(s1);
      person1.speak();

      Person person2 = new Person();
      person2.name = "Artem";
      person2.age = 31;
      person2.speak();
      person2.sayHello();
      int year1 = person2.calculateYearsToRetirement();
        System.out.println("To Retirement "+ year1 + " years " + person2.name);

        //System.out.println("Меня зовут "+ person1.name + ", "+ "мне "+ person1.age +" года.");
        //System.out.println("Меня зовут "+ person2.name + ", "+ "мне "+ person2.age +" год.");

        Rat rat1 = new Rat();
        rat1.name = "Dex";
        rat1.age = 3;
        rat1.color = "White";
        rat1.run();

        //System.out.println(rat1.color + " rat "+ rat1.name + " " + rat1.age + " years old");

    }
}
// У класса могут быть:
// 1) Данные (поля)
// 2) Действия, который он может совершать(методы)
class Person{
    String name;
    int age;

    void setData(String username, int userage){
        name = username;
        age = userage;

    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        for(int i = 0; i <= 2; i++){
            System.out.println("My name is "+ name + ", i am "+ age +" years old.");
        }

    }
    void sayHello(){
        System.out.println("Hello, i am  " + name);
    }
}

class Rat{
    String name;
    int age;
    String color;

    void run (){
        int circle = 0;
        while (circle < 5){
            System.out.println(name + " run"+ circle +" surcle");
            circle++;
        }
    }
}
