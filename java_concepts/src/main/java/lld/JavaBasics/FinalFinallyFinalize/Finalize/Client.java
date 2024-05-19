package lld.JavaBasics.FinalFinallyFinalize.Finalize;

public class Client {
    public static void main(String[] args) {
        // Finalize is a method that the Garbage Collector always calls just before the
        // deletion/destroying of the object which is eligible for Garbage Collection,
        // so as to perform clean-up activity. Clean-up activity means closing the
        // resources associated with that object like Database Connection, Network
        // Connection, or we can say resource de-allocation. It is not a
        // reserved keyword. Once the finalized method completes immediately Garbage
        // Collector destroys that object.

        // Since the Object class contains the finalize method, hence finalize method is
        // available for every Java class since Object is the superclass of all Java
        // classes. Since it is available for every java class hence Garbage Collector
        // can call finalize method on any Java object Now, the finalize method which is
        // present in the Object class, has an empty implementation, in our class
        // clean-up activities are there, then we have to override this method to define
        // our own clean-up activities.

        Hello s = new Hello();
        s = null;
        System.gc();
        System.out.println("Main Completes");
    }
}

// class Hello {
// public static void main(String[] args) {

// String s = new String("RR");
// s = null;

// // Requesting JVM to call Garbage Collector method
// // This doens't print "finalize method overridden" since object being cleaned
// up
// // is s of String class
// System.gc();
// System.out.println("Main Completes");
// }

// public void finalize() {
// System.out.println("finalize method overridden");
// }
// }
