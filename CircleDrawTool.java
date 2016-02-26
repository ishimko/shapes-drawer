import java.awt.event.MouseEvent;

public class CircleDrawTool extends DrawTool {
    public CircleDrawTool(ShapesDrawer shapesDrawer){
        super(shapesDrawer);
        getChooseToolBtn().setText("Окружность");
        getChooseToolBtn().addMouseListener(new ChooseCircleBtnMouseListener(shapesDrawer));
    }


    @Override
    public void mousePressed(MouseEvent e) {
        drawingShape = new Circle(new Point(e), 1);
        createShape(drawingShape);
    }

    private class ChooseCircleBtnMouseListener extends ChooseToolBtnMouseListener{
        public ChooseCircleBtnMouseListener(ShapesDrawer shapesDrawer) {
            super(shapesDrawer);
        }

        @Override
        public void mousePressed(MouseEvent e){
            getShapesDrawer().setDrawTool(CircleDrawTool.this);
        }
    }
}
