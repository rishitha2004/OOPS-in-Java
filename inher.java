//import java.util.*;
class ASuper{
    int x;
    int y;
    void showij(){
        System.out.println("The values of x and y are:"+x+" "+y);
    }
}
class BSub extends ASuper{
    int z;
    void showk(){
        System.out.println("k: "+z);
    }
    void sum(){
        System.out.println("The sum of x,y and z is: "+(x+y+z));
    }
}
public class inher {
    public static void main(String[] args){
        ASuper one=new ASuper();
        BSub two=new BSub();
        //Super Class
        one.x=10;
        one.y=90;
        one.showij();
        //Sub Class
        two.x=10;
        two.y=20;
        two.z=30;
        two.showk();
        two.showij();
        two.sum();
    }
}
