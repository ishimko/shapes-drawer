import java.awt.*;

public class Ellipse extends Shape{
    protected Point a, b;
    public Ellipse(Point topLeft, int width, int height) {
        a = topLeft;
        b = new Point(topLeft.x + width, topLeft.y + height);
    }

    protected Point getTopLeft(){
        int xMin = Math.min(a.x, b.x);
        int yMin = Math.min(a.y, b.y);

        return new Point(xMin, yMin);
    }

    public void refreshShape(Point p){
        b = new Point(p);
    }

    protected Point getBottomRight(){
        int xMax = Math.max(a.x, b.x);
        int yMax = Math.max(a.y, b.y);

        return new Point(xMax, yMax);
    }

    public void draw(Graphics g) {
        g.setColor(getBorderColor());

        Point topLeft = getTopLeft();
        Point bottomRight = getBottomRight();

        g.drawOval(topLeft.x, topLeft.y, bottomRight.x - topLeft.x, bottomRight.y -topLeft.y);
    }
}
