class A{
    A(){
        System.out.println("Inside A constructor");
    }
}
class B extends A{
    B(){
        System.out.println("Inside B constructor");
    }
}
class C extends B{
    C(){
        System.out.println("Inside C constructor");
    }
}
public class callingcons {
    public static void main(String[] args){
        C obj=new C();
    }
}
