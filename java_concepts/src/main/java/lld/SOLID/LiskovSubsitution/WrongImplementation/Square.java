package lld.SOLID.LiskovSubsitution.WrongImplementation;

// Subclass violating Liskov Subsitution
public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}