public class Lessons23Part2 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.printf("hello, my dear %s \n", "Pony");
        System.out.printf(" To insert int use %d or use %f" , 8, 27.00);
        System.out.println();

        System.out.printf("Для форматирования после процента укажи ширину значения %-10d \n", 675);
        // знак минус переносит влево
        System.out.printf("Для форматирования после процента укажи ширину значения %10d \n", 5);
        System.out.printf("Для форматирования после процента укажи ширину значения %10d \n", 12);
        System.out.printf("Для форматирования после процента укажи ширину значения %10d \n", 10000);
        System.out.printf("Для форматирования после процента укажи ширину значения %10d \n", 1000000000);
        // Будет число шириной в 10 символов
        // \n -- переносит строку
        System.out.printf("Вещественное число %.2f \n", 45.8888);
        System.out.printf("Вещественное число %.2f \n", 1.8);
        System.out.printf("Вещественное число %.2f \n", 555.758548);
        System.out.printf("Вещественное число %.2f \n", 45.89);
    }
}
