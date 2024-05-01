package lld.SOLID.LiskovSubsitution.CorrectImplementation;

public class Square extends Shape {
    int side;

    @Override
    int area() {
        return side * side;
    }
}
