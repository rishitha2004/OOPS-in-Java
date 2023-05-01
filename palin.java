import java.util.*;
public class palin {
    public static void main(String[] args){
        System.out.println("Enter string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("This is a palindrome");
        }
        else{
            System.out.println("This is not a palindrome");
        }
    }
}