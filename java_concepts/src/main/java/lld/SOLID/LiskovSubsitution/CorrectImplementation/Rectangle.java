package lld.SOLID.LiskovSubsitution.CorrectImplementation;

public class Rectangle extends Shape {
    int width;

    int height;

    @Override
    int area() {
        return width * height;
    }
}
