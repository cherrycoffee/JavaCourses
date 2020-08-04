public class Lessons23 {
    public static void main(String[] args) {
        /*
        String x = "Hello";
        String string1 = "Hello ";
        String string2 = "World";
        String string3 = " You are beautiful";
        String stringAll = string1+string2+string3;
        System.out.println(stringAll);
        x = x.toUpperCase();System.out.println(x);

         */

        StringBuilder sb  = new StringBuilder("Hello");
        System.out.println(sb.toString());
        //sb.append(" my friend");  то же самое, что и внизу ( метод ниже называется ченнинг)
        //sb.append(" !!!!");
        sb.append(" my friend").append("!!!!");
        System.out.println(sb.toString());

    }
}
