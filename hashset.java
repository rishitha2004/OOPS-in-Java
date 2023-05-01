import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String>ha=new HashSet<String>();
        // adds according to hashcode and need not necessarily follow alphabetical order
        ha.add("Rishi");
        ha.add("Rishitha");
        ha.add("Samith");
        ha.add("Aruna");
        ha.add("Ashok");
        System.out.println("The contents of hashset are: "+ha);
    }
}
