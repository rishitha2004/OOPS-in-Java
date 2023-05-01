class box{
    double width;
    double height;
    double depth;
    //when object is passed to constructor
    box(box ob){
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    //when all attributes are given
    box(double x,double y,double z){
        width=x;
        height=y;
        depth=z;
    }
    box(){
        width=-1;
        height=-1;
        depth=-1;
    }
    double volume(){
        return width*height*depth;
    }
}
class wbox extends box{
    double weight;
    //for wbox
    wbox(double a,double b,double c,double d){
        width=a;
        height=b;
        depth=c;
        weight=d;
    }
}
public class demo {
    public static void main(String[] args){
        wbox ob1=new wbox(1,2,3,5);
        wbox ob2=new wbox(2,4,6,9);
        double v1=ob1.volume();
        System.out.println("The volume of ob1 is : "+v1);
        System.out.println("The weight of ob1 is : "+ob1.weight);
        System.out.println();
        double v2=ob1.volume();
        System.out.println("The volume of ob2 is : "+v2);
        System.out.println("The weight of ob2 is : "+ob2.weight);
        box plainbox=new box();
        plainbox=ob1;
        double vol;
        vol=plainbox.volume();
        System.out.println("The volume of plainbox is : "+vol);
        //weight cannot be resolved from superclass
        //System.out.println("The weight of ob1 is : "+plainbox.weight);


    }
}
