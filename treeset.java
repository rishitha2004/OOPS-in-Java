import java.util.TreeSet;
public class treeset {
    public static void main(String[] args) {
        TreeSet<String>ta=new TreeSet<String>();
        // follow alphabetical order
        ta.add("Rishi");
        ta.add("Rishitha");
        ta.add("Samith");
        ta.add("Aruna");
        ta.add("Ashok");
        System.out.println("The contents of treeset are: "+ta);
        System.out.println("Treeset follows alphabetical order");
    }
}
