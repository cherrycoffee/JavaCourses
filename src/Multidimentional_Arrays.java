public class Multidimentional_Arrays {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[1]);
       int [][] num = {{1,2,3},{5,8,9},{8,1,-1}};
        /*System.out.println(num[1][0]);
        System.out.println(num[0][0]);

        int[][] matrix = new int[3][3];
        String[][] table = new String[3][3];
        table[0][1] = "Доброе утро";
        System.out.println(table[0][1]);

         */
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
