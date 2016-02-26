import java.awt.event.MouseEvent;

public class EllipseDrawTool extends DrawTool{
    public EllipseDrawTool(ShapesDrawer shapesDrawer){
        super(shapesDrawer);
        getChooseToolBtn().setText("Эллипс");
        getChooseToolBtn().addMouseListener(new ChooseEllipseBtnListener(shapesDrawer));
    }

    @Override
    public void mousePressed(MouseEvent e) {
        drawingShape = new Ellipse(new Point(e), 2, 2);
        createShape(drawingShape);
    }

    private class ChooseEllipseBtnListener extends ChooseToolBtnMouseListener{
        public ChooseEllipseBtnListener(ShapesDrawer shapesDrawer) {
            super(shapesDrawer);
        }

        public void mousePressed(MouseEvent e){
            getShapesDrawer().setDrawTool(EllipseDrawTool.this);
        }
    }
}
