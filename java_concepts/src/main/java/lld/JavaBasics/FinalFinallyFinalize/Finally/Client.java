package lld.JavaBasics.FinalFinallyFinalize.Finally;

public class Client {
    public static void main(String[] args) {
        // finally code is always executed whether an error is thrown or not
        try {
            System.out.println("inside A");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("A's finally");
        }
    }
}
