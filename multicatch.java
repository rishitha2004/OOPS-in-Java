public class multicatch {
    public static void main(String[] args) {
        try {
            // int a = args.length;
            int a = 1;
            int b = 42 / a;
            int c[] = { 1 };
            int d = c[98];
        } catch (ArithmeticException e) {
            System.out.println("Exception:" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception:" + e);
        }
        System.out.println("After try and catch blocks");
    }
}
