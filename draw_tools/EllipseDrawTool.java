package draw_tools;

import shapes.Ellipse;
import shapes.Point;

import java.awt.event.MouseEvent;

public class EllipseDrawTool extends DrawTool {
    public EllipseDrawTool(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseToolBtn().setText("Эллипс");
        getChooseToolBtn().addMouseListener(new ChooseToolBtnMouseListener(shapesDrawer) {
            public void mousePressed(MouseEvent e) {
                getShapesDrawer().setDrawTool(EllipseDrawTool.this);
            }
        });
    }

    @Override
    public void mousePressed(MouseEvent e) {
        drawingShape = new Ellipse(new Point(e), 2, 2);
        createShape(drawingShape);
    }
}
