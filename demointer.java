interface Callback{
    void callback(int a);
}
class demo implements Callback{
    public void callback(int a){
        System.out.println("Called with: "+a);
    }
    void msg(){
        System.out.println("This is a msg");
    }
}
public class demointer {
    public static void main(String[] args){
        Callback c=new demo();
        c.callback(45);
        //demo c=new demo();
        //c.msg();
    }
}
