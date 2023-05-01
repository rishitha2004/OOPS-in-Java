import java.util.*;

class hashtable{
    public static void main(String[] args){
        Hashtable<Integer,String>ht1=new Hashtable<Integer,String>();
        ht1.put(48,"Monicia");
        ht1.put(62,"Rupert Grint");
        ht1.put(74,"Hermione");
        ht1.put(87,"Malfoy");
        ht1.put(60,"Snape");
        System.out.println("Original map:"+ht1);
        ht1.remove(87);
        System.out.println("Modified:"+ht1);
        ht1.putIfAbsent(16,"Lilly");
        System.out.println("Updated:"+ht1);
    }
}