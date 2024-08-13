package week06.movable;

public class MovableCircle implements Movable {
    private MovablePoint center;
    private float radius;

    public MovableCircle(MovablePoint center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    public void changeRadius(float newRadius) {
        this.radius = newRadius;
    }

    public void resize(float newRadius) {
        this.radius = newRadius;
    }

    @Override
    public String toString() {
        return "Circle [center = " + center + ", radius = " + radius + "]";
    }
}