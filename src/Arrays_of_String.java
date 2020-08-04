public class Arrays_of_String {
    public static void main(String[] args){
        int[] numb = new int[5];
        numb[0] = 5;
        System.out.println(numb[0]);
        System.out.println(numb[1]);

        String[] str = new String[3];
        str[0] = "Привет ";
        str[1] = "Как ты там?";
        str[2] = "Енот";
        System.out.println(str[0]);

        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
        System.out.println();

        for(String string: str){  //тип данных, имя переменной, имя массива
            System.out.println(string);

        }
        int[] id = {1, 4, 6, 8};
        int sum = 0;
        for(int sumid: id){
            sum = sum + sumid;
        }
        System.out.println();
        System.out.println(sum);

    }
}
