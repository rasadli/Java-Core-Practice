package week06.shape;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getLength(); // or getWidth(), since they are equal in a square
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void resize(double factor) {
        setSide(getSide() * factor);
    }

}
