class demo extends Thread{
    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().threadId()+"is runnning");
        }
        catch(Exception e){
            System.out.println("Exception caught");
        }
   }
}
class Multithread{
    public static void main(String[] args){
        int n=8;
        for(int i=0;i<n;i++){
            demo obj=new demo();
            obj.start();
        }
    }
}
//If we extend thread class our class cannot extend to other base classes