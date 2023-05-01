class Figure{
    double dim1;
    double dim2;
    Figure(double a,double b){
        dim1=a;
        dim2=b;
    }
    double area(){
        System.out.println("Area of figure is undefined");
        return 0;
    }
}
class rectangle extends Figure{
    rectangle(double a,double b){
        super(a,b);
    }
    double area(){
        return dim1*dim2;
    }
}
class triangle extends Figure{
    triangle(double a,double b){
        super(a,b);
    }
    double area(){
        return (dim1*dim2)/2;
    }
}
public class area {
    public static void main(String[] args){
        Figure f=new Figure(10,7);
        rectangle r=new rectangle(5, 4);
        triangle t=new triangle(6, 8);
        Figure figref;
        
        figref=r;
        double area=r.area();
        System.out.println("Area: "+area);

        figref=t;
        double area1=t.area();
        System.out.println("Area: "+area1);

        figref=f;
        double area2=f.area();
        System.out.println("Area: "+area2);
    }
}
