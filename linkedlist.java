import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String>ll=new LinkedList<String>();
        ll.add("Rishi");
        ll.add("Rish");
        ll.add("Rishitha");
        ll.add(1,"Samith");
        ll.addFirst("Ashok");
        ll.addLast("Aruna");
        System.out.println("Original contents of Linked list: "+ll);
        ll.remove("Rish");
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After removing some contents: "+ll);
        String val=ll.get(2);
        System.out.println("The value at 2nd index is: "+val);
        ll.set(2,val+" Chowdary");
        System.out.println("After changing a value: "+ll);
    }
}
