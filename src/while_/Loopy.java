package while_;

public class Loopy {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("Перед началом цикла");
        while (x < 5){
            System.out.println("Внутри цикла");
            System.out.println("Значение x равно " + x);
            //x = x + 1;
            x++;

        }
        System.out.println("После окончания цикла");
    }
}
