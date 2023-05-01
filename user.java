public class user {
    public static void main(String[] args){
        int a,d;
        try{
            a=0;
            d=87/a;
            System.out.println("This will not be printed");
        }catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        System.out.println("After catch statement");
    }
}
