package lld.DataTypes;

import java.util.Stack;

public class Client {
    /*
     * Stacks
     * Generale Iterable Type; can be used for datatypes that can be iterated over
    */
     public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        Client.display(st);

    }

    static void display(Iterable list){
        for(Object data: list){
            System.out.println(data);
        }
    }
}
