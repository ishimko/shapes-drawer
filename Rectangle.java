//package src;

public class Rectangle extends Polyline {
    public Rectangle(Point bottomLeft, int width, int height){
        addPoint(new Point(bottomLeft.x, bottomLeft.y));
        addPoint(new Point(bottomLeft.x, bottomLeft.y - height));
        addPoint(new Point(bottomLeft.x + width, bottomLeft.y - height));
        addPoint(new Point(bottomLeft.x + width, bottomLeft.y));
    }
}
