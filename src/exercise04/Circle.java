package exercise04;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }




    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public Circle(String color) {
        super(color);
    }
}
