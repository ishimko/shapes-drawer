import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class LineDrawTool extends DrawTool{
    private Line drawingLine;

    public LineDrawTool(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseToolBtn().setText("Линия");
        getChooseToolBtn().addMouseListener(new ChooseLineBtnMouseListener(shapesDrawer));
    }

    public void mousePressed(MouseEvent e) {
        drawingLine = new Line(new Point(e.getX(), e.getY()));
        createShape(drawingLine);
    }

    public void mouseDragged(MouseEvent e){
        drawingLine.setFinishPoint(new Point(e.getX(), e.getY()));
        getShapesDrawer().draw();
    }

    private class ChooseLineBtnMouseListener extends ChooseToolBtnMouseListener{
        public ChooseLineBtnMouseListener(ShapesDrawer shapesDrawer){
            super(shapesDrawer);
        }

        public void mousePressed(MouseEvent e){
            super.removeListeners();

            shapesDrawer.addMouseListener(LineDrawTool.this);
            shapesDrawer.addMouseMotionListener(LineDrawTool.this);

            System.out.print("line mode\n");
        }
    }

}

