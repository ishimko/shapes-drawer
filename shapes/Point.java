package shapes;

import java.awt.event.MouseEvent;

public class Point {
    public int x, y;

    public Point(){}

    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }

    public Point(MouseEvent e){
        this.x = e.getX();
        this.y = e.getY();
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
