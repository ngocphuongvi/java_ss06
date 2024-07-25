package rikkei.academy;

public class Square extends Shape implements Resizeable, Colorable  {
    double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super( color, filled);
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String toString() {
        return "A Square with side = "
                + getSide();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() *(1+percent/100));
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four sides.");
    }
}
