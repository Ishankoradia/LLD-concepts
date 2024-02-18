package lld.Constructors;

/*
 * Here is an example of "copy constructor" where you can create a new instance 
 * from an object already created one in memory. 
 */
public class Node {
    // write the code of node class here
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(Node nn) {
        this.data = nn.data;
        this.next = new Node(nn.next.data); // this is deep copying;
        // this.next = nn.next; // this is shallow copy; where next of "this" & "nn" are pointing to the same location
    }
}