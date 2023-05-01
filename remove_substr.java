import java.lang.*;
import java.util.*;

public class remove_substr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder("");
        System.out.println("Enter a string:");
        s.append(sc.nextLine());
        while(s.length()!=0){
            int flag=0;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    s.replace(i,i+2,"");
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }     
        }
        System.out.println("Finally: "+s);
        sc.close();
    }
}
