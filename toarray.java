import java.util.*;

public class toarray{
    public static void main(String[] args){
        ArrayList<Integer>al=new ArrayList<Integer>();
        System.out.println("Size of arraylist before adding elements: "+al.size());
        al.add(2);
        al.add(4);
        al.add(1);
        al.add(12);
        al.add(56);
        al.add(42);
        al.add(7);
        System.out.println("The contents of arraylist after adding: "+al);
        System.out.println("Size of arraylist after adding elements: "+al.size());
        Integer[] ia=new Integer[al.size()];
        ia=al.toArray(ia);
        int sum=0;
        System.out.print("The contents of array: ");
        for(int i:ia){
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.print("\n");
        System.out.println("Sum of elements of array : "+sum);
    }
}