package week06;

import week06.movable.*;

public class MovableTest {

    public static void main(String[] args) {

        // Testing added behaviours to classes
        MovablePoint point = new MovablePoint(2, 3);
        point.moveUp();
        point.moveRight();

        MovableCircle circle = new MovableCircle(new MovablePoint(3, 4), 2);
        circle.moveLeft();
        circle.moveDown();

        System.out.println("Point is at (" + point.getX() + "," + point.getY() + ")");
        System.out.println("Circle center is at (" + circle.getCenter().getX() + "," + circle.getCenter().getY() + ")");

        // Array of Points,Segments,Circles
        Movable[] movables = new Movable[] {
                new MovablePoint(2, 4),
                new MovableSegment(new MovablePoint(1, 2), new MovablePoint(3, 1)),
                new MovableCircle(new MovablePoint(4, 5), (float) 3.0)
        };

        moveAll(movables, "up");

        for (Movable movable : movables) {
            System.out.println(movable.toString());
        }

        // We can also use: System.out.println(Arrays.toString(movables));
    }


    public static void moveAll(Movable[] movables, String direction) {
        for (Movable movable : movables) {
            switch (direction.toLowerCase()) {
                case "up":
                    movable.moveUp();
                    break;
                case "down":
                    movable.moveDown();
                    break;
                case "right":
                    movable.moveRight();
                    break;
                case "left":
                    movable.moveLeft();
                    ;
                    break;
                default:
                    System.out.println("Invalid direction. Use up, down, right or left");
                    break;
            }
        }
    }
}
