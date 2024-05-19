package lld.Oops.InheritanceAndPolymorphism;

public class Client {
    public static void main(String[] args) {
        /**
         * Polymorphism literally means many forms.
         * In Java, polymorphism allows us to perform a single action in different ways.
         * There are two types of Polymorphism in Java: compile time polymorphism and
         * runtime polymorphism.
         * 
         * 1) Compile time polymorphism: Method overloading
         * The example below demonstrates method overloading.
         * Two functions with the same name but different parameters are said to be
         * overloaded
         * Basically C's fun method has different forms (polymorphism).
         */
        C c = new C();
        c.fun(); // inside C's fun
        c.fun(10); // inside C's fun + 10

        /**
         * 2) Runtime polymorphism: Method overriding. Also known as dynamic method
         * dispatch.
         * Method overriding occurs when a subclass declares a method that is already
         * present in its parent class.
         * Then the subclass's method overrides the parent class's method.
         * This can be figured out only at runtime
         */
        P new_obj = new C(); // C class has taken the form of P class. This is polymorphism.

        new_obj.fun(); // inside C's fun, althought the reference is of P class, the method.
        System.out.println(new_obj.d); // 100, since the reference is of P class, the variable is of P class. There is
                                       // no such thinf as attribute overriding.
        System.out.println(new_obj.d1); // 10, since the reference is of P class, the variable is of P class. There is
                                        // no such thinf as attribute overriding.
        System.out.println(((C) new_obj).d); // we are casting the object to class C. So, the d variable of C class is
                                             // printed.
        // System.out.print(new_obj.d2); // error, since the reference is of P class,
        // the variable is of P class. d2 is not attribute of class P
        System.out.println(((C) new_obj).d2); // casting to type C works
    }
}
