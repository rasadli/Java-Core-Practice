package week06.movable;

import java.io.Serializable;

import week03.geometry.Segment;

public class MovableSegment extends Segment implements Movable, Cloneable, Serializable {

    private MovablePoint p1;
    private MovablePoint p2;

    public MovableSegment(MovablePoint p1, MovablePoint p2) {
        super(p1, p2);  // Assuming that Segment superclass constructor takes MovablePoint objects
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public void moveUp() {
        p1.moveUp();
        p2.moveUp();
    }

    @Override
    public void moveDown() {
        p1.moveDown();
        p2.moveDown();
    }

    @Override
    public void moveLeft() {
        p1.moveLeft();
        p2.moveLeft();
    }

    @Override
    public void moveRight() {
        p1.moveRight();
        p2.moveRight();
    }

    @Override
    public String toString() {
        return "Segment [Point1 = " + p1 + ", Point2 = " + p2 + "]";
    }
}
