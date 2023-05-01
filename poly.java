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
class another implements Callback{
    public void callback(int p){
        System.out.println("This is another");
        System.out.println("p squared :"+p*p);
    }
}
public class poly {
    public static void main(String[] args){
        Callback c=new demo();
        another obj=new another();
        c.callback(45);
        c=obj;
        c.callback(42);
    }
}
