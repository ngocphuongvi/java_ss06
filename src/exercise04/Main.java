package exercise04;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,5,"Red");
        System.out.println("Rectangle Area: "+rectangle.getArea());
        rectangle.display();

        Circle circle=new Circle(3,"Blue");
        System.out.println("Circle Area: "+circle.getArea());
        circle.display();
    }
}
