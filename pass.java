import java.util.*;
public class pass {
    public static void main(String[] args){
        System.out.println("Enter string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if((s.split(" ").length>1)||s.charAt(0)!='G'||s.length()<8){
            System.out.println("Not valid password");
        }
        else{
            System.out.println("Valid password");
        }
    }
}