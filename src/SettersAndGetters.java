public class SettersAndGetters {
    public static void main(String[] args) {
        Persons person1 = new Persons();
        person1.setName("Margo");
        person1.setAge(18);
        person1.speak();
        System.out.println(" Выводим значение в main методе " + person1.getName());
        System.out.println(" Выводим значение возраста в main методе " + person1.getAge());


        Persons person2 = new Persons();
        person2.setAge(-5);
        person2.setName("");
        person2.speak();
    }
}

class Persons {
    private String name;
    private int age;

    public String getName() {     // геттер
        return name;
    }

    public void setName(String userName) { // сеттер
        if (userName.isEmpty()) {
            System.out.println("Name is empty ");
        } else {
            name = userName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Age is not valid");
        } else {
            age = userAge;
        }
    }

    void setData(String username, int userage) {
        name = username;
        age = userage;

    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i <= 2; i++) {
            System.out.println("My name is " + name + ", i am " + age + " years old.");
        }
    }

    void sayHello() {
        System.out.println("Hello, i am  " + name);
    }
}