class box{
    double width;
    double height;
    double depth;
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
class wship extends wbox{
    double cost;
    wship(double x,double y,double z,double k,double l){
        super(x,y,z,k);
        cost=l;
    }
}
public class multilevel {
    public static void main(String[] args){
        wship obj=new wship(2,4,5,10,700);
        double vol;
        vol=obj.volume();
        System.out.println("Volume:"+vol);
        System.out.println("Weight:"+obj.weight);
        System.out.println("Cost:"+obj.cost);
    }
}
