class box{
    private double width;
    private double height;
    private double depth;
    //when all attributes are given
    box(double x,double y,double z){
        width=x;
        height=y;
        depth=z;
    }
    double volume(){
        return width*height*depth;
    }
}
class wbox extends box{
    double weight;
    //for wbox
    wbox(double a,double b,double c,double d){
        super(a,b,c);
        weight=d;
    }
}
public class keysup {
    public static void main(String[] args){
        wbox a=new wbox(2,5,6,7);
        double vol=a.volume();
        System.out.println("The volume:"+vol);
        System.out.println("Weight : "+a.weight);
    }
}
