import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String>hp=new HashMap<Integer,String>();
        hp.put(3,"Monicia");
        hp.put(1,"Wednesday");
        hp.put(7,"Draco Malfoy");
        hp.put(5,"Severus Snape");
        for(HashMap.Entry<Integer,String>entry:hp.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
