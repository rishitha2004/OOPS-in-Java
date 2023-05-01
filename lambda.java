import java.util.*;

public class lambda{
    public static void main(String[] args){
        ArrayList<Integer>num=new ArrayList<Integer>();
        num.add(8);
        num.add(4);
        num.add(80);
        num.add(58);
        System.out.print("The arraylist consists of: ");
        num.forEach((n)->{System.out.println(n);});
     }
}