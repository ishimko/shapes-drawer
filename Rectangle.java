//package src;

public class Rectangle extends Polygon {
    public Rectangle(Point topLeft, int width, int height){
        addPoint(new Point(topLeft.x, topLeft.y));
        addPoint(new Point(topLeft.x + width, topLeft.y));
        addPoint(new Point(topLeft.x + width, topLeft.y + height));
        addPoint(new Point(topLeft.x, topLeft.y + height));
    }

    private Point getTopLeft(){
        return getPoint(0);
    }

    public void setBottomRight(Point bottomRight){
        setPoint(1, new Point(bottomRight.x, getTopLeft().y));
        setPoint(2, bottomRight);
        setPoint(3, new Point(getTopLeft().x, bottomRight.y));
    }
}
