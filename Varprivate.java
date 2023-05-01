class A{
    int x;
    int y;
    //private int y;
    //you cannot access private variables in subclass
    void setij(int i,int j){
        x=i;
        y=j;
    }
}
class B extends A{
    void sum(){
        System.out.println("The sum of x and y is"+(x+y));
    }
}
public class Varprivate {
    public static void main(String[] args){
        B obj=new B();
        obj.setij(10,20);
        obj.sum();
    }
}
