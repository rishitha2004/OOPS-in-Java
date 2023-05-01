import java.util.*;

class pqueue{
    public static void main(String[] args){
        PriorityQueue<String>pq=new PriorityQueue<String>();
        pq.add("Arjun");
        pq.add("Rudra");
        pq.add("Mahavir");
        pq.add("Baldev");
        pq.add("Khushi");
        System.out.println("First:"+pq.peek());
        Iterator it=pq.iterator();
        System.out.print("Queue elements: ");
        while(it.hasNext()){
            System.out.print(it.next()+",");
        }
        System.out.print("\n");
        pq.remove();
        pq.poll();
        System.out.print("After removing first two elements: ");
        Iterator<String> itr=pq.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+",");
        }
        System.out.print("\n");
    }
}