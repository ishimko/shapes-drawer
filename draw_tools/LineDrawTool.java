package draw_tools;

import shapes.Line;
import shapes.Point;

import java.awt.event.MouseEvent;


public class LineDrawTool extends DrawTool {
    public LineDrawTool(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseToolBtn().setText("Линия");
        getChooseToolBtn().addMouseListener(new ChooseToolBtnMouseListener(shapesDrawer) {
            public void mousePressed(MouseEvent e) {
                getShapesDrawer().setDrawTool(LineDrawTool.this);
            }
        });
    }

    public void mousePressed(MouseEvent e) {
        drawingShape = new Line(new Point(e.getX(), e.getY()));
        createShape(drawingShape);
    }
}

