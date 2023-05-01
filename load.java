//Method Overloading
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
    void show(String S){
        System.out.println(S+c);
    }
}
public class load {
    public static void main(String[] args){
        B obj=new B(3,4,6);
        //show in A
        obj.show();
        //show in B
        obj.show("This is c: ");
    }
}
