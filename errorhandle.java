import java.util.Random;

public class errorhandle {
    public static void main(String[] args) {
        Random r = new Random();
        int a, b, c;
        for (int i = 0; i < 10; i++) {
            try {
                b = r.nextInt(1, 9);
                c = r.nextInt(1, 9);
                a = 13 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Exception:"+e);
                a = 0;
            }
            System.out.println("a:" + a);
        }
    }
}
