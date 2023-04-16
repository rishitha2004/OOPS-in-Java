public class string_basics {
    public static void main(String[] args){
        char arr[]={'a','b','c','d','e','f'};
        String s=new String(arr);
        System.out.println("s:"+s);
        String s1=new String(arr,2,4);
        System.out.println("s1:"+s1);
        char a[]={'R','i','s','h'};
        String s2=new String(a);
        String s3=new String(s2);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
        byte ascii[]={65,66,67,68,69,70};
        String a1=new String(ascii);
        System.out.println("a1:"+a1);
        System.out.println("Length of a1:"+a1.length());
        String a2=new String(ascii,2,3);
        System.out.println("a2:"+a2);
        String a3="Rish";
        System.out.println("Length:"+a3.length());
        System.out.println("Length in other way:"+"Rish".length());
        String age="19";
        String b="I am "+age+" years old";
        System.out.println(b);
        //When data type is int
        int age1=19;
        String b1="I am "+age1+" years old";
        System.out.println(b1);
        //Operator Precedence
        String b2="Four:"+2+2;
        System.out.println(b2);
        String b3="Four:"+(2+2);
        System.out.println(b3);

    }
}
