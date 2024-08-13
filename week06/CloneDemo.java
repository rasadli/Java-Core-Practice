package week06;

import week05.rectangle.*;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle r1 = new Rectangle(3, 5);
        Rectangle r2 = (Rectangle) r1.clone();
        r1.width = 10;
        System.out.println(r2.width);
    }
}