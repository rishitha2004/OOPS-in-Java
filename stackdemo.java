import java.util.*;

class stackdemo{
    public static void main(String[] args){
        Stack<String>st=new Stack<String>();
        boolean res=st.empty();
        System.out.println("Is the stack empty? "+res);
        System.out.println("Adding elements to the stack:");
        st.push("Voldemort");
        st.push("Rupert");
        st.push("Draco");
        st.push("Snape");
        st.push("Dobby");
        System.out.println("Elements in the stack: "+st);
        System.out.println("Top element:"+st.peek());
        res=st.empty();
        System.out.println("Is the stack empty? "+res);
        st.pop();
        st.pop();
        System.out.println("Elements in the stack after removing two elements: "+st);
        res=st.empty();
        System.out.println("Is the stack empty? "+res);
    }
}