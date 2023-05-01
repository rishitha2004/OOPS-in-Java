public class methtry {
    static void nestry(int a){
        try{
            if(a==1){
                a=a/(a-a);
            }
            if(a>1){
                int c[]={1};
                int d=c[80];
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
    public static void main(String[] args) {
        try {
            //int a = args.length;
            // int a=1;
            int a=6;
            int b = 45 / a;
            System.out.println("a= " + a);
            nestry(a);
        } catch (ArithmeticException e) {
            System.out.println(" Arithmetic Exception");
        }
    }
}
