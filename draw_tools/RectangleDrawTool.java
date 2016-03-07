package draw_tools;

import shapes.Point;
import shapes.Rectangle;

import java.awt.event.MouseEvent;

public class RectangleDrawTool extends DrawTool{
    public RectangleDrawTool(ShapesDrawer shapesDrawer){
        super(shapesDrawer);
        getChooseToolBtn().setText("Прямоугольник");
        getChooseToolBtn().addMouseListener(new ChooseToolBtnMouseListener(shapesDrawer){
            public void mousePressed(MouseEvent e){
                getShapesDrawer().setDrawTool(RectangleDrawTool.this);
            }
        });
    }

    public void mousePressed(MouseEvent e){
        drawingShape = new Rectangle(new Point(e.getX(), e.getY()), 1, 1);
        createShape(drawingShape);
    }
}
