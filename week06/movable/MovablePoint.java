package week06.movable;

import java.io.Serializable;

import week03.geometry.Point;

public class MovablePoint extends Point implements Movable, Cloneable, Serializable {

    public MovablePoint(int x, int y) {
        super(x, y);
    }

    @Override
    public void moveUp() {
        setY(getY() + 1); // Increment y-coordinate to move up
    }

    @Override
    public void moveDown() {
        setY(getY() - 1); // Decrement y-coordinate to move down
    }

    @Override
    public void moveLeft() {
        setX(getX() - 1); // Decrement x-coordinate to move left
    }

    @Override
    public void moveRight() {
        setX(getX() + 1); // Increment x-coordinate to move right
    }

    @Override
    public String toString() {
        return "Point [x = " + getX() + ", y= " + getY() + "]";
    }

}