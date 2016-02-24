import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class LineDrawer extends MouseAdapter{
    private ShapesDrawer shapesDrawer;
    private Line drawingLine;
    private JButton setButton = new JButton("Линия");

    public LineDrawer(ShapesDrawer shapesDrawer) {
        this.shapesDrawer = shapesDrawer;
    }

    public void mousePressed(MouseEvent e) {
        drawingLine = new Line(new Point(e.getX(), e.getY()));
        addLine();
    }

    public void mouseDragged(MouseEvent e){
        drawingLine.setFinishPoint(new Point(e.getX(), e.getY()));
        shapesDrawer.draw();
    }

    private void addLine() {
        shapesDrawer.addShape(drawingLine);
        shapesDrawer.draw();
    }

    public JButton getSetButton(){
        return setButton;
    }

}

