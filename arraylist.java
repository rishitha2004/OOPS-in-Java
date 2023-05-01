import java.util.*;

public class arraylist{
    public static void main(String[] args){
        ArrayList<String>al=new ArrayList<String>();
        System.out.println("Size of arraylist before adding elements: "+al.size());
        al.add("R");
        al.add("B");
        al.add(1,"AS");
        al.add(2,"RI");
        al.add("AR");
        al.add("SAM");
        al.add("RUK");
        System.out.println("The contents of arraylist after adding: "+al);
        System.out.println("Size of arraylist after adding elements: "+al.size());
        al.remove("AR");
        al.remove("AS");
        al.remove(2);
        System.out.println("The contents of arraylist after removing: "+al);
        System.out.println("Size of arraylist after removing elements: "+al.size());
    }
}