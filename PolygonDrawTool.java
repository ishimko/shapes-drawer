import java.awt.event.MouseEvent;

public class PolygonDrawTool extends MultidotShapeDrawTool {
    public PolygonDrawTool(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseToolBtn().setText("Многоугольник");
        getChooseToolBtn().addMouseListener(new ChoosePolygonBtnBtnMouseListener(shapesDrawer));
    }

    protected Polygon createMultidotShape(Point point){
        return new Polygon(point);
    }

    private class ChoosePolygonBtnBtnMouseListener extends ChooseToolBtnMouseListener{
        public ChoosePolygonBtnBtnMouseListener(ShapesDrawer shapesDrawer){super(shapesDrawer);}

        public void mousePressed(MouseEvent e){
            getShapesDrawer().setDrawTool(PolygonDrawTool.this);
        }
    }
}