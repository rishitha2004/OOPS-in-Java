class NewThread implements Runnable{
    String name;
    Thread t;
    NewThread(String Threadname){
        name=Threadname;
        t=new Thread(this,name);
        System.out.println("New Thread started:"+t);
        t.setName(name+"Changed");
        System.out.println("After name change"+t);
        t.start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name+":"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(name+" Interrupted");
        }
        System.out.println(name+" exiting");
   }
}
public class threadmet {
    public static void main(String[] args){
        NewThread ob1=new NewThread("First");
        NewThread ob2=new NewThread("Second");
        NewThread ob3=new NewThread("Third");
        System.out.println("Thread First is alive"+ob1.t.isAlive());
        System.out.println("Thread Second is alive"+ob2.t.isAlive());
        System.out.println("Thread Third is alive"+ob3.t.isAlive());
        try{
            System.out.println("waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(Exception e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Thread First is alive"+ob1.t.isAlive());
        System.out.println("Thread Second is alive"+ob2.t.isAlive());
        System.out.println("Thread Third is alive"+ob3.t.isAlive());
        System.out.println("Main thread exiting");
    }
}
