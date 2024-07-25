package exercise04;

public class Rectangle extends Shape {
double width;
double height;
public Rectangle(double width, double height, String color) {
    super(color);
    this.width = width;
    this.height = height;
}
public double getWidth() {
    return width;
}
public double getHeight() {
    return height;
}
public void setWidth(double width) {
    this.width = width;
}
public void setHeight(double height) {
    this.height = height;
}



    @Override
    public double getArea() {
        return width*height;
    }
    public Rectangle(String color) {
        super(color);
    }
}
