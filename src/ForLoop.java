public class ForLoop {
    public static void main(String[] args){
        for(int i = 0; i <= 10; i++){ //i++ == i = i+1 (true)
            System.out.println("Hello " + i);
        }
        for (int j = 10; j >= 0; j = j-5){
            System.out.println("By " + j);
        }
    }
}
