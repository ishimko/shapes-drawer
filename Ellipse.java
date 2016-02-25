import java.awt.*;

public class Ellipse extends Rectangle{
    public Ellipse(Point topLeft, int width, int height) {
        super(topLeft, width, height);
    }

    private Point getTopLeft(){
        int xMin = Math.min(Math.min(getPoint(0).x, getPoint(1).x), Math.min(getPoint(2).x, getPoint(3).x));
        int yMin = Math.min(Math.min(getPoint(0).y, getPoint(1).y), Math.min(getPoint(2).y, getPoint(3).y));

        return new Point(xMin, yMin);
    }

    private Point getBottomRight(){
        int xMax = Math.max(Math.max(getPoint(0).x, getPoint(1).x), Math.max(getPoint(2).x, getPoint(3).x));
        int yMax = Math.max(Math.max(getPoint(0).y, getPoint(1).y), Math.max(getPoint(2).y, getPoint(3).y));

        return new Point(xMax, yMax);
    }

    private int getHeight(){
        return getBottomRight().y - getTopLeft().y;
    }

    private int getWidth(){
        return getBottomRight().x - getTopLeft().x;
    }

    public void draw(Graphics g) {
        g.setColor(getBorderColor());
        g.drawOval(getTopLeft().x, getTopLeft().y, getWidth(), getHeight());
    }
}
