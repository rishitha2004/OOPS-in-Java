public class finallydemo {
    static void procA(){
        try{
            System.out.println("Inside proc A");
            throw new NullPointerException("demo");
        }finally{
            System.out.println("After proc A");
        }
    }
    static void procB(){
        try{
            System.out.println("Inside proc B");
            return;
        }finally{
            System.out.println("After proc B");
        }
    }
    static void procC(){
        try{
            System.out.println("Inside proc C");
        }finally{
            System.out.println("After proc C");
        }
    }
    public static void main(String[] args){
        try{
            procA();
        }catch(Exception e){
            System.out.println("Exception"+e);
        }
        procB();
        procC();
    }
}
