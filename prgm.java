class A{
    A(){
        System.out.println("This msg is from A");
    }
}

class B extends A{
    B(){
        System.out.println("This msg is from B");
    }
}

class C extends B{
    C(){
        System.out.println("This msg is from C");
    }
}
public class prgm {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        C c=new C();
    }
}
