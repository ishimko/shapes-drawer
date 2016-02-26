import java.awt.*;

public class Polygon extends Polyline{
    public Polygon(){}

    public Polygon(Point point){
        super(point);
    }

    public void draw(Graphics g){
        g.setColor(getBorderColor());
        g.drawPolygon(getXs(), getYs(), getPointsCount());
    }
}
