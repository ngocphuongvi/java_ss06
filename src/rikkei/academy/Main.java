package rikkei.academy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//Kiểm thử Class Shape
        System.out.println("-------- - SHAPE----------");

        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

//kiểm thử Class Circle
        System.out.println("-------- - CIRCLE----------");

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
//Kiểm thử RECTANGLE
        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
//Kiểm thử SQUARE
        System.out.println("---------SQUARE----------");

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

        //bai1
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Square(4.0);

        Random random = new Random();

        for (Shape shape1 : shapes) {

            double resizePercent = 1 + random.nextInt(100);
            ((Resizeable) shape1).resize(resizePercent);
            System.out.printf("Shape: %s\n", shape1.toString()); //%s chèn 1 chuỗi. \n xuống dòng
            System.out.printf("Resized by: %.2f%%\n", resizePercent);//%.2f lấy 2 chữ số thập phân. %% hiển thị %
        }

        //bai2
        Shape[] shapes2 = new Shape[4];
        shapes2[0] = new Rectangle(4.0, 5.0, "Red",true);
        shapes2[1] = new Circle(3.0, "Blue",false);
        shapes2[2] = new Square(6.0, "Green", true);
        shapes2[3] = new Square(7.0, "Yellow", false);

        for (Shape shape2 : shapes2) {

            if (shape2 instanceof Colorable) {
                ((Colorable) shape2).howToColor();
            }
            System.out.println("Shape: " + shape2.toString());
        }
    }
}