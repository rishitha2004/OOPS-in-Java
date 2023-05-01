public class met {
    public static void main(String[] args){
        String a="Rishitha";
        String b="Samith";
        String c="abcd";
        String d="abcde";
        String e="abcdE";
        int i=3;
        System.out.println("The element at index "+i+" in the string "+a+" is: "+a.charAt(i));
        System.out.println("When the strings "+c+" and "+d+" are compared: "+c.compareTo(d));
        System.out.println("When the strings "+d+" and "+e+" are compared: "+d.compareTo(e));
        b=b.concat(" is my little brother");
        System.out.println(b);
        System.out.println(a.contains("ish"));
        System.out.println(b.contains("the"));
        System.out.println(a.endsWith("ish"));
        System.out.println(a.endsWith("ish"));
        System.out.println(a.endsWith("ha"));
        String s1="hello";
        String s2="HELLO";
        String s3="hello";
        String s4="hell";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(b.indexOf("little"));
        String x="";
        System.out.println(s1.isEmpty());
        System.out.println(x.isEmpty());
        System.out.println(a.length());
        System.out.println(b.lastIndexOf("h"));
        System.out.println(a.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.replace('l','p'));
        String y="little my little";
        System.out.println(b.replace("little","baby"));
        System.out.println(y.replaceFirst("little","baby"));
        System.out.println(y.replaceAll("little","baby"));
    }
}
