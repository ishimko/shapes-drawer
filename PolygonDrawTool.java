import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;

public class PolygonDrawTool extends DrawTool {
    private Polygon drawingPolygon = null;
    public PolygonDrawTool(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseToolBtn().setText("Многоугольник");
        getChooseToolBtn().addMouseListener(new ChoosePolygonBtnBtnMouseListener(shapesDrawer));
    }

    public void mousePressed(MouseEvent e) {
        Point pressedPoint = new Point(e);
        if (drawingShape == null) {
            System.out.print("drawingShape == null");
            drawingShape = new Polygon(pressedPoint);
            drawingPolygon = (Polygon) drawingShape;
            createShape(drawingShape);
        } else {
            if ((e.getModifiers() & InputEvent.CTRL_MASK) != 0) {
                drawingShape = null;
            } else {
                drawingShape.refreshShape(pressedPoint);
                getShapesDrawer().draw();
            }
        }

    }

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void finishDrawing(){
        drawingShape = null;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (drawingShape != null) {
            drawingPolygon.setFinishPoint(new Point(e));
            getShapesDrawer().draw();
        }

    }

    private class ChoosePolygonBtnBtnMouseListener extends ChooseToolBtnMouseListener{
        public ChoosePolygonBtnBtnMouseListener(ShapesDrawer shapesDrawer){super(shapesDrawer);}

        public void mousePressed(MouseEvent e){
            getShapesDrawer().setDrawTool(PolygonDrawTool.this);
        }
    }
}
