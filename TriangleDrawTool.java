import java.awt.event.MouseEvent;

public class TriangleDrawTool extends DrawTool {
    public TriangleDrawTool(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseToolBtn().setText("Треугольник");
        getChooseToolBtn().addMouseListener(new ChooseTriangleBtnMouseListener(shapesDrawer));
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point pressedPoint = new Point(e.getX(), e.getY());
        drawingShape = new Triangle(pressedPoint, pressedPoint);
        createShape(drawingShape);
    }


    private class ChooseTriangleBtnMouseListener extends ChooseToolBtnMouseListener {
        public ChooseTriangleBtnMouseListener(ShapesDrawer shapesDrawer) {
            super(shapesDrawer);
        }

        public void mousePressed(MouseEvent e) {
            getShapesDrawer().setDrawTool(TriangleDrawTool.this);
        }
    }
}
