package lld.SOLID.LiskovSubsitution.WrongImplementation;

public class Client {

    static void modifyRectangle(Rectangle rect, int newWidth, int newHeight) {
        rect.setHeight(newWidth);
        rect.setHeight(newHeight);
    }

    public static void main(String[] args) {
        /*
         * Clearly here you cannot subsitute a square directly in place of recatangle
         * because it gives you some unexpected/different results. You are expecting an
         * area of 5*10=50 but you get 10*10=100. This violates the Liskov's principle.
         * 
         * Liskov's subsitution doesn't mean you should override methods, but these sub
         * class shouldn't have a different meaning.
         * 
         * Similarly, in the Penguin (Bird) example , especially in v3. I cannot
         * subsitute "new Penguin()" in place of a Bird object because the fly() method
         * is behaving different or specially; it either throws an error or it is empty
         */

        Rectangle rectangle2 = new Square();
        modifyRectangle(rectangle2, 5, 10);

        int area2 = rectangle2.calculateArea();
        System.out.println("Area of modified : " + area2);
    }
}
