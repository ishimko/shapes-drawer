import java.awt.event.MouseEvent;


public class LineDrawTool extends DrawTool{
    public LineDrawTool(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseToolBtn().setText("Линия");
        getChooseToolBtn().addMouseListener(new ChooseLineBtnMouseListener(shapesDrawer));
    }

    public void mousePressed(MouseEvent e) {
        drawingShape = new Line(new Point(e.getX(), e.getY()));
        createShape(drawingShape);
    }

    private class ChooseLineBtnMouseListener extends ChooseToolBtnMouseListener{
        public ChooseLineBtnMouseListener(ShapesDrawer shapesDrawer){
            super(shapesDrawer);
        }

        public void mousePressed(MouseEvent e){
            getShapesDrawer().setDrawTool(LineDrawTool.this);
        }
    }

}

