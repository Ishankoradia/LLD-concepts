package lld.JavaBasics.FinalFinallyFinalize.Final;

public class Client {
    public static void main(String[] args) {
        // final can be used in front of a variable which means its value cannot be
        // updates
        final int b = 10;

        // final can be used in front of a class which means this class cannot be
        // subclassed
        // Also by default all method & attributes for a final class are final unless
        // specified otherwise
        final class qq {
            int i;
        }

        // // compile time error
        // class rr extends qq {
        // int j;
        // }

        // final can be used in front of a method which means this method cannot be
        // overriden. No polymorphism
        class pp {
            final void rr() {
                System.out.println("some final methor");
            }
        }

        class tt extends pp {
            // // compile time error; cannot override final method in pp
            // void rr() {

            // }
        }
    }
}