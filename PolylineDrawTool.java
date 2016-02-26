import java.awt.event.MouseEvent;

public class PolylineDrawTool extends MultidotShapeDrawTool {
    public PolylineDrawTool(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseToolBtn().setText("Ломаная");
        getChooseToolBtn().addMouseListener(new ChoosePolylineBtnBtnMouseListener(shapesDrawer));
    }

    protected Polyline createMultidotShape(Point point){
        return new Polyline(point);
    }

    private class ChoosePolylineBtnBtnMouseListener extends ChooseToolBtnMouseListener{
        public ChoosePolylineBtnBtnMouseListener(ShapesDrawer shapesDrawer){super(shapesDrawer);}

        public void mousePressed(MouseEvent e){
            getShapesDrawer().setDrawTool(PolylineDrawTool.this);
        }
    }
}
