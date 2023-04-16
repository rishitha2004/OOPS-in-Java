class Box{
    double width;
    double height;
    double depth;
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    public String toString(){
        return "Dimensions are "+width+" by "+height+" by "+depth;
    }
}
public class toStringDemo {
    public static void main(String[] args){
        Box b=new Box(10, 20, 30);
        String s="Box b: "+b;
        System.out.println(b);
        System.out.println(s);
    }
}
