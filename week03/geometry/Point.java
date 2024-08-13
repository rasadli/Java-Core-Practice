package week03.geometry;

public class Point {
    private float x;
    private float y;

    // empty constructor
    public Point() {
        this.x = 1;
        this.y = 1;
    }

    // defining with parameters
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // creating a copy
    public Point(Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    // getters and setters for x and y
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // translator
    public void translate(float dx, float dy) {
        x += dx;
        y += dy;
    }

    // calculate distance
    public float distance(Point p) {
        float dx = (p.getX() - this.x) * (p.getX() - this.x);
        float dy = (p.getY() - this.y) * (p.getY() - this.y);

        // return (float) Math.sqrt(Math.pow(dx, 2)+Math.pow(dy, 2));
        return (float) Math.hypot(dx, dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        // Check if the object is the same as this point
        if (this == obj) {
            return true;
        }
        // Check if the object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Convert the object to a Point and compare coordinates
        Point otherPoint = (Point) obj;
        return Float.compare(otherPoint.x, x) == 0 && Float.compare(otherPoint.y, y) == 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}
