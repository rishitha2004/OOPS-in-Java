import java.util.*;
public class occure {
    public static void main(String[] args){
        System.out.println("Enter string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("Enter substring:");
        Scanner scb=new Scanner(System.in);
        String sb=scb.next();
        System.out.println("The no. of occurrences of "+sb+" is "+count(s,sb));
    }
    static int count(String a,String b){
        if(a.contains(b)){
            return 1+count(a.replaceFirst(b,""),b);
        }
        return 0;
    }
}