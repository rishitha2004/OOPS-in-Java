public class stringmodification {
    public static void main(String[] args){
        String s="Hilfinger";
        String p=s.substring(2);
        System.out.println("s:"+s);
        System.out.println("p:"+p);
        String q=s.substring(3,6);
        System.out.println("q:"+q);

        //Concatenation
        String s1="Heat ";
        String s2="waves";
        System.out.println("After concatenation:"+s1.concat(s2));
        String s3="Ocean "+s2;
        System.out.println("Modified concatenation:"+s3);

        String b1="Hello";
        System.out.println(b1.replace('l','w'));
        String x="Bow".replace('B','H');
        System.out.println("x after modification:"+x);

        String S="  Hello World   ";
        System.out.println("Before trimming:"+S);
        System.out.println("After trimming:"+S.trim());
    }
}
