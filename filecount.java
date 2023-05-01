import java.lang.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException; 

public class filecount{
    public static void main(String[] args){
    try{
    
        File ob=new File("myfile"); 
        Scanner sc=new Scanner(ob);
        String s=sc.nextLine();
        Scanner scr=new Scanner(System.in);
        System.out.println("What do you want to find?");
        String find=scr.nextLine();
        int cnt=0;
        String words[]=s.split("\\s");
        //System.out.println(words);
        for(String w:words){
        //System.out.print(w+" "+"\n");
            if(w.equals(find)){
                cnt++;
            }
        }
        System.out.println("The no of times "+find+" occurred is "+cnt);
    }
    catch(FileNotFoundException e){
        System.out.println("Error");
    }
    }
}