class Myexception extends Exception{
    private int detail;
    Myexception(int a){
        detail=a;
    }
    public String toString(){
        return "Myexception["+detail+"]";
    }
}
public class exceptiondemo {
    static void demo(int a)throws Myexception {
        System.out.println("Called demo("+a+")");
        if(a>10){
            throw new Myexception(a);
        }
        else{
            System.out.println("Normal exit");
        }

    }
    public static void main(String[] args){
        try{
            demo(10);
            demo(20);
        }catch(Exception e){
            System.out.println("Caught:"+e);
        }
    }
}
