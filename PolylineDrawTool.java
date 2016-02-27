import java.awt.event.MouseEvent;

public class PolylineDrawTool extends MultidotShapeDrawTool {
    public PolylineDrawTool(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseToolBtn().setText("Ломаная");
        getChooseToolBtn().addMouseListener(new ChooseToolBtnMouseListener(shapesDrawer){
            public void mousePressed(MouseEvent e){
                getShapesDrawer().setDrawTool(PolylineDrawTool.this);
            }
        });
    }

    protected Polyline createMultidotShape(Point point){
        return new Polyline(point);
    }
}
