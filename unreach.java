public class unreach {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 45 / a;
        } catch (Exception e) {
            System.out.print("Exception: " + e);
        }
        // This will never be reached as it is a subclass of generic exception
        // catch(ArithmeticException e){
        // System.out.println(e+" This is never reached");
        // }
    }
}
