package shapes;

import java.awt.*;

public class Ellipse extends Shape{
    private Point fixedPoint, movingPoint;
    public Ellipse(Point topLeft, int width, int height) {
        fixedPoint = topLeft;
        movingPoint = new Point(topLeft.x + width, topLeft.y + height);
    }

    protected Point getFixedPoint(){
        return this.fixedPoint;
    }

    protected Point getTopLeft(){
        int xMin = Math.min(fixedPoint.x, movingPoint.x);
        int yMin = Math.min(fixedPoint.y, movingPoint.y);

        return new Point(xMin, yMin);
    }

    public void refreshShape(Point point){
        movingPoint = new Point(point);
    }

    protected Point getBottomRight(){
        int xMax = Math.max(fixedPoint.x, movingPoint.x);
        int yMax = Math.max(fixedPoint.y, movingPoint.y);

        return new Point(xMax, yMax);
    }

    public void draw(Graphics g) {
        g.setColor(getBorderColor());

        Point topLeft = getTopLeft();
        Point bottomRight = getBottomRight();

        g.drawOval(topLeft.x, topLeft.y, bottomRight.x - topLeft.x, bottomRight.y - topLeft.y);
    }
}
