public class throwsDemo {
    static void demothrow() throws IllegalAccessException{
        System.out.println("Inside demothrow");
        throw new IllegalAccessException("Nope");
    }
    public static void main(String[] args){
        try{
            demothrow();
        }catch(Exception e){
            System.out.println("Caught: "+e);
        }
    }
}
