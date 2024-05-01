package lld.SOLID.LiskovSubsitution.WrongImplementation;

public class Rectangle {
    protected int height;

    protected int width;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
}
