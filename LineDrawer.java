import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class LineDrawer extends MouseAdapter{
    private Point startPoint, stopPoint;
    private ShapesDrawer shapesDrawer;

    public LineDrawer(ShapesDrawer shapesDrawer) {
        this.shapesDrawer = shapesDrawer;
        startPoint = new Point();
        stopPoint = new Point();
    }

    public void mousePressed(MouseEvent e) {
        startPoint.x = e.getX();
        startPoint.y = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
        stopPoint.x = e.getX();
        stopPoint.y = e.getY();

        addLine();
    }

    private void addLine() {
        shapesDrawer.addShape(new Line(startPoint, stopPoint));
        shapesDrawer.draw();
    }

}

