package draw_tools;

import shapes.Circle;
import shapes.Point;

import java.awt.event.MouseEvent;

public class CircleDrawTool extends DrawTool {
    public CircleDrawTool(ShapesDrawer shapesDrawer){
        super(shapesDrawer);
        getChooseToolBtn().setText("Окружность");
        getChooseToolBtn().addMouseListener(new ChooseToolBtnMouseListener(shapesDrawer){
            public void mousePressed(MouseEvent e){
                getShapesDrawer().setDrawTool(CircleDrawTool.this);
            }
        });
    }


    @Override
    public void mousePressed(MouseEvent e) {
        drawingShape = new Circle(new Point(e), 1);
        createShape(drawingShape);
    }
}
