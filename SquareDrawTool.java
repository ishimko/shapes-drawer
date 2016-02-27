import java.awt.event.MouseEvent;

public class SquareDrawTool extends DrawTool {
    public SquareDrawTool(ShapesDrawer shapesDrawer){
        super(shapesDrawer);
        getChooseToolBtn().setText("Квадрат");
        getChooseToolBtn().addMouseListener(new ChooseToolBtnMouseListener(shapesDrawer){
            public void mousePressed(MouseEvent e){
                getShapesDrawer().setDrawTool(SquareDrawTool.this);
            }
        });
    }

    @Override
    public void mousePressed(MouseEvent e){
        drawingShape = new Square(new Point(e.getX(), e.getY()), 1);
        createShape(drawingShape);
    }
}
