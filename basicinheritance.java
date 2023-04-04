class A{
    int i,j;

    void showij(){
        System.out.println("i="+i+","+"j="+j);
    }
}

class B extends A{
    int k;
    void showk(){
        System.out.println("k="+k);
    }
    void sum(){
        System.out.println("Sum of i,j,k is: "+(i+j+k));
    }
}

class basicinheritance{
    public static void main(String[] args){
        A superOb=new A();
        B subOb=new B();
        superOb.i=30;
        superOb.j=40;
        System.out.println("Contents of superOb:");
        superOb.showij();

        subOb.i=2;
        subOb.j=5;
        subOb.k=7;
        System.out.println("Contents of subOb:");
        subOb.showij();
        subOb.showk();
        subOb.sum();
    }
}