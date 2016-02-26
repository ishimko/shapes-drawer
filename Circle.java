import java.awt.*;

public class Circle extends Ellipse {
    public Circle(Point center, int radius){
        super(new Point(center.x - radius, center.y - radius), radius*2, radius*2);
    }

//    @Override
//    public void refreshShape(Point point){
//        int newWidth = Math.abs(getFixedPoint().x - point.x);
//        int newHeight = Math.abs(getFixedPoint().y - point.y);
//
//        if (newHeight < newWidth){
//            super.refreshShape(new Point(getFixedPoint().x, point.y));
//        } else {
//            super.refreshShape(new Point(point.x, getFixedPoint().y));
//        }
//    }

    @Override
    public void draw(Graphics g){
        g.setColor(getBorderColor());

        int width = getBottomRight().x - getTopLeft().x;
        int height = getBottomRight().y - getTopLeft().y;
        int d = Math.min(width, height);

        Point fixedPoint = getFixedPoint();
        int topX = fixedPoint.x + d * (int)Math.signum(getTopLeft().x - fixedPoint.x);
        int topY = fixedPoint.y + d * (int)Math.signum(getTopLeft().y - fixedPoint.y);

        g.drawOval(topX, topY, d, d);
    }
}
