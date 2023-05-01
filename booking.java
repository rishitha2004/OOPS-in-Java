import java.util.*;
import java.io.*;

class reserve {
    synchronized void ri() {
        System.out.println("NO of seats available is : " + booking.avail);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many seats do you want?");
        int a = sc.nextInt();
        Thread k = Thread.currentThread();
        if (booking.avail - a >= 0) {
            System.out.println(k.getName() + " entered");
            System.out.println(k.getName() + " reserved " + a + " seats");
            booking.avail = booking.avail - a;
        } else {
            System.out.println("Not possible to reserve");
            System.out.println("Press 0 to exit or change the number of seats");
            Scanner x = new Scanner(System.in);
            int s = x.nextInt();
            if (s == 0) {
                System.out.println(k.getName() + " is leaving");
            } else {
                ri();
            }
            x.close();
        }
        System.out.println(k.getName() + " is leaving ");
        sc.close();
    }
}

class bseat implements Runnable {
    Thread t;
    int a;
    reserve z;
    String name;

    bseat(String n, reserve q) {
        name = n;
        z = q;
        t = new Thread(this, name);
    }

    public void run() {
        System.out.println("No of seats available is : " + booking.avail);
        z.ri();
    }

}

public class booking {
    public static int avail = 100;
    public static int tseat = 1000;

    public static void main(String[] args) {
        reserve z = new reserve();
        bseat p1 = new bseat("p1", z);
        bseat p2 = new bseat("p2", z);
        bseat p3 = new bseat("p3", z);
        bseat p4 = new bseat("p4", z);
        p1.t.start();
        p2.t.start();
        p3.t.start();
        p4.t.start();
        p1.t.setPriority(5);
        p2.t.setPriority(4);
        p3.t.setPriority(3);
        p4.t.setPriority(2);
        try {
            p1.t.join();
            p2.t.join();
            p3.t.join();
            p4.t.join();
        } catch (Exception e) {
            System.out.println("Exception caught");

        }
    }
}
