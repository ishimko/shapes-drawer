import java.awt.*;

public class Polygon extends Polyline{

    public void draw(Graphics g){
        g.setColor(getBorderColor());
        g.drawPolygon(getXs(), getYs(), getPointsCount());
    }
}
