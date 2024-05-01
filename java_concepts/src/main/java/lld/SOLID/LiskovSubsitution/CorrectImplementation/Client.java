package lld.SOLID.LiskovSubsitution.CorrectImplementation;

public class Client {
    static void printAread(Shape shape) {
        System.out.println("Area of shape is : " + shape.area());
    }

    public static void main(String[] args) {
        /*
         * Now if you see the overriden method doesn;t do anything out of ordinary; you
         * can expect the area
         */
        Shape rect = new Rectangle();
        ((Rectangle) rect).width = 5;
        ((Rectangle) rect).height = 10;

        Shape square = new Square();
        ((Square) square).side = 5;

        printAread(rect);
        printAread(square);

    }
}
