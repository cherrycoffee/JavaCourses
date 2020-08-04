public class Lessons21 {
    public static void main(String[] args) {

        Ex ex1 = new Ex("Eldar", 30);
        Ex ex2 = new Ex("Eldar", 30);
        ex1.printCountOfEx();


        /*Ex.description = " Al Ex is bad";
        ex1.getAllFields();
        ex2.getAllFields();
        Ex.description = "Nice";
        ex1.getAllFields();
        ex2.getAllFields();

         */


        //System.out.println(Math.pow(2,4));
        //System.out.println(Math.PI);
    }
}
class Ex {
    private String name;
    private int age;
    //public static String description;
    private static int countEx = 0;

   public Ex(String name, int age){
       System.out.println(" Привет из третьего конструктора!");
       this.name = name;
       this.age = age;
       countEx++;
   }

   public void setAge(int age){
       this.age = age;
   }
   public void setName(String name){
       this.name = name;
   }

   public void printCountOfEx(){
       System.out.println(countEx);
   }
   /*public static void getDescription(){
       System.out.println(description);
   }


    public void getAllFields(){
        System.out.println(name + " " + " "+ age + " " + description);
    }

    */
    /*
    public static void printAllFields(){ //нельзя обращать к НЕ статической переменной обьекта в стат методе
        System.out.println(name);

     */
    }


