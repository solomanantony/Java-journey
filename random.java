import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        number = random.nextInt(1,100);//100 will not be shown
        System.out.println(number);
    }
}
