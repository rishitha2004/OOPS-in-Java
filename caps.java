import java.lang.*;
import java.util.*;

public class caps{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String words[]=s.split("\\s");
        String caps="";
        for(String w:words){
            String first=w.substring(0,1);
            String next=w.substring(1);
            caps+=first.toUpperCase()+next+" ";
        }
        System.out.println("After capitalising string:"+caps);
        sc.close();
    }
}

