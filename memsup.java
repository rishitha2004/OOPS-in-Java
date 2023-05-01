class A{
    int i;
    void show(){
        System.out.println("i in A:"+i);
    }
}
class B extends A{
    int i;
    B(int x,int y){
        super.i=x;
        i=y;
    }
    void show(){
        //System.out.println("i in A:"+super.i);
        super.show();
        System.out.println("i in B:"+i);
    }
}
public class memsup {
    public static void main(String[] args){
        B obj=new B(10,30);
        obj.show();
    }
}
