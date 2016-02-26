import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RectangleDrawTool extends DrawTool{
    public RectangleDrawTool(ShapesDrawer shapesDrawer){
        super(shapesDrawer);
        getChooseToolBtn().setText("Прямоугольник");
        getChooseToolBtn().addMouseListener(new ChooseRectangleBtnMouseListener(shapesDrawer));
    }

    public void mousePressed(MouseEvent e){
        drawingShape = new Rectangle(new Point(e.getX(), e.getY()), 1, 1);
        createShape(drawingShape);
    }

    private class ChooseRectangleBtnMouseListener extends ChooseToolBtnMouseListener {
        public ChooseRectangleBtnMouseListener(ShapesDrawer shapesDrawer){
            super(shapesDrawer);
        }

        public void mousePressed(MouseEvent e){
            getShapesDrawer().setDrawTool(RectangleDrawTool.this);
        }
    }


}
