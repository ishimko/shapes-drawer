import java.awt.*;

public class Line implements Figure {
    Point a, b;

    public Line(Point a, Point b){
        this.a = a;
        this.b = a;
    }

    public void draw(Graphics g){
        g.drawLine(a.x, a.y, b.x, b.y);
    }
}
