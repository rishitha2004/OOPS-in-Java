public class Stringcomparison {
    public static void main(String[] args){
        //equals
        String s1="Rishi";
        String s2="rishi";
        System.out.println(s1+" equals "+s2+"->"+s1.equals(s2));

        String a1="Tolu";
        String a2="molu";
        System.out.println(a1+" equals "+a2+"->"+a1.equals(a2));

        String b1="rishi";
        String b2="rishi";
        System.out.println(b1+" equals "+b2+"->"+b1.equals(b2));

        String c1="RisHi";
        String c2="riShI";
        System.out.println(c1+" equalsIgnoreCase "+c2+"->"+c1.equalsIgnoreCase(c2));

        String p="Konanki Rishitha";
        String q="rishitha";
        System.out.println("p region matched with q: "+p.regionMatches(8, q, 0, 8));
        System.out.println("p region matched with q with case: "+p.regionMatches(true,8, q, 0, 8));

        String h="Samith";
        System.out.println(h.startsWith("Sam"));
        System.out.println(h.startsWith("mit", 2));

        System.out.println(h.endsWith("th"));
        System.out.println(h.endsWith("tha"));

        String u=new String(h);
        System.out.println(h.equals(u));
        System.out.println(h==u);

        //equals to
        String a="rishi";
        String b="rish";
        String c="Rishi";
        String d="rish";
        System.out.println(a.compareTo(b));
        System.out.println(c.compareTo(a));
        System.out.println(b.compareTo(d));

        String r="that one girl";
        System.out.println("Index of t: "+r.indexOf('t'));
        System.out.println("Last index of t: "+r.lastIndexOf('t'));
        System.out.println("Index of t after setting start index: "+r.indexOf('t',3));
        System.out.println("Index of t after setting start index: "+r.indexOf('t',5));
    }
}
