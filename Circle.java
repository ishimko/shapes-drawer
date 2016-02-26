import java.awt.*;

public class Circle extends Ellipse {
    public Circle(Point center, int radius){
        super(new Point(center.x - radius, center.y - radius), radius*2, radius*2);
    }

    @Override
    public void draw(Graphics g){
        g.setColor(getBorderColor());

        Point topLeft = getTopLeft();
        Point bottomRight = getBottomRight();
        int width = bottomRight.x - topLeft.x;

        g.drawOval(topLeft.x, topLeft.y, width, width);
    }
}
