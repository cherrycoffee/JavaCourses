public class Lessons20Constructor {
    public static void main(String[] args) {
        Humans human = new Humans("Vova", 6);
        System.out.println(human);
        human.toString();

    }
}
class Humans{
private String name;
private int age;

public Humans(){
    this.name = "Anonim";
    this.age = 18;

}

public Humans(String name){
    System.out.println("привет из второго конструктора");
    this.name = name;
}

public Humans(String name, int age){
    System.out.println(" привет из третьего конструктора");
    this.name = name;
    this.age = age;
}

public void setName(String name){
    this.name = name;
}
public void setAge(int age){
    this.age = age;
}

public String toString(){
    return name + "," + age;
}
}