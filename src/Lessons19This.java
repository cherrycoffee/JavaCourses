public class Lessons19This {
    public static void main(String[] args) {
        Human sapiens = new Human();
        sapiens.setAge(13000);
        sapiens.setName("HomoSapiens");
        sapiens.getInfo();

        Human humanoid = new Human();
        humanoid.setName("Earthling");
        humanoid.setAge(33);
        humanoid.getInfo();


    }
}
class Human{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name + " " + age);
    }
}
