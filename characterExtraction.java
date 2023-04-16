public class characterExtraction {
    public static void main(String[] args){
        // charAt method
        // String s="Rishitha";
        // System.out.println(s.charAt(3));
        // System.out.println(s.charAt(7));
        // getChars 
        String s1="I am Rishitha Chowdary";
        int start=5;
        int end=13;
        char buf[]=new char[end-start];
        s1.getChars(start, end, buf, 0);
        System.out.println(buf);
    }
}
