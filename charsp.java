import java.lang.*;
import java.util.*;

public class charsp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        int c=0;
        int d=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((Character.isDigit(ch))||(Character.isAlphabetic(ch))){
                d++;
            }
            else{
                c++;
            }
        }
        System.out.println("No of special characters: "+c);
        sc.close();
    }
}