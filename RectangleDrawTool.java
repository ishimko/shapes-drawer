import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RectangleDrawTool extends DrawTool{
    private Rectangle drawingRectangle;

    public RectangleDrawTool(ShapesDrawer shapesDrawer){
        super(shapesDrawer);
        getChooseToolBtn().setText("Прямоугольник");
        getChooseToolBtn().addMouseListener(new ChooseRectangleBtnMouseListener(shapesDrawer));
    }

    public void mousePressed(MouseEvent e){
        drawingRectangle = new Rectangle(new Point(e.getX(), e.getY()), 1, 1);
        createShape(drawingRectangle);
    }

    public void mouseDragged(MouseEvent e){
        drawingRectangle.setBottomRight(new Point(e.getX(), e.getY()));
        getShapesDrawer().draw();
    }

    private class ChooseRectangleBtnMouseListener extends ChooseToolBtnMouseListener {
        public ChooseRectangleBtnMouseListener(ShapesDrawer shapesDrawer){
            super(shapesDrawer);
        }

        public void mousePressed(MouseEvent e){
            super.removeListeners();

            shapesDrawer.addMouseListener(RectangleDrawTool.this);
            shapesDrawer.addMouseMotionListener(RectangleDrawTool.this);

            System.out.print("rectangle mode\n");
        }
    }


}
