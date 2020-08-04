public class Arrays {
    public static boolean toString;

    public static void main(String[] args){
        int number = 10; // [10]
        int[] numbers = new int[5]; // numbers --> [массив]
        /*
        numbers[0] = 10; инициализация элементов массива по одному
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 5;
        numbers[4] = 8;
         */
        for(int i = 0; i < numbers.length;i++){
            numbers[i] = i*10;

        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        int[] numbers1 = {1, 3, 5, 10, 78, 567}; // заранее уже известными числами
        for(int i = 0; i < numbers1.length; i++){
            System.out.println(numbers1[i]);
        }
    }


}
