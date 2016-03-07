package draw_tools;

import shapes.Point;
import shapes.Triangle;

import java.awt.event.MouseEvent;

public class TriangleDrawTool extends DrawTool {
    public TriangleDrawTool(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseToolBtn().setText("Треугольник");
        getChooseToolBtn().addMouseListener(new ChooseToolBtnMouseListener(shapesDrawer){
            public void mousePressed(MouseEvent e) {
                getShapesDrawer().setDrawTool(TriangleDrawTool.this);
            }
        });
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point pressedPoint = new Point(e.getX(), e.getY());
        drawingShape = new Triangle(pressedPoint, pressedPoint);
        createShape(drawingShape);
    }
}
