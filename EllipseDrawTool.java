import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EllipseDrawTool extends DrawTool{
    public EllipseDrawTool(ShapesDrawer shapesDrawer){
        super(shapesDrawer);
        getChooseToolBtn().setText("Эллипс");
        getChooseToolBtn().addMouseListener(new ChooseEllipseBtnListener(shapesDrawer));
    }

    @Override
    public void mousePressed(MouseEvent e){
        drawingShape = new Ellipse(new Point(e.getX(), e.getY()), 2, 2);
        createShape(drawingShape);
    }

    private class ChooseEllipseBtnListener extends ChooseToolBtnMouseListener{
        public ChooseEllipseBtnListener(ShapesDrawer shapesDrawer) {
            super(shapesDrawer);
        }

        @Override
        public void mousePressed(MouseEvent e){
            removeListeners();

            getShapesDrawer().addMouseListener(EllipseDrawTool.this);
            getShapesDrawer().addMouseMotionListener(EllipseDrawTool.this);
        }
    }
}
