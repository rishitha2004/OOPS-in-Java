//Method Overriding
class A{
    int a;
    int b;
    A(int x,int y){
        a=x;
        b=y;
    }
    void show(){
        System.out.println("a and b are: "+a+" "+b);
    }
}
class B extends A{
    int c;
    B(int x,int y,int z){
        super(x,y);
        c=z;
    }
    void show(){
        //super.show();
        System.out.println("c: "+c);
    }
}
public class met {
    public static void main(String[] args){
        B obj=new B(3,4,6);
        obj.show();
        
    }
}
