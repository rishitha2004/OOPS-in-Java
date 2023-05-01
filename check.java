import java.util.*;
public class check {
    public static void main(String[] args){
        System.out.println("Enter string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0;
        int c=0;
        int d=0;
        int sp=0;
        s=s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {        
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {        
                v++;    
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                c++;
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                d++;
            }
            else{
                sp++;
            }
        } 
        System.out.println("No of vowels: "+v); 
        System.out.println("No of consonants: "+c); 
        System.out.println("No of digits: "+d); 
    }
}