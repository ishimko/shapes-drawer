package draw_tools;

import shapes.Point;
import shapes.Polygon;

import java.awt.event.MouseEvent;

public class PolygonDrawTool extends MultidotShapeDrawTool {
    public PolygonDrawTool(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseToolBtn().setText("Многоугольник");
        getChooseToolBtn().addMouseListener(new ChooseToolBtnMouseListener(shapesDrawer){
            public void mousePressed(MouseEvent e){
                getShapesDrawer().setDrawTool(PolygonDrawTool.this);
            }
        });
    }

    protected Polygon createMultidotShape(Point point){
        return new Polygon(point);
    }
}