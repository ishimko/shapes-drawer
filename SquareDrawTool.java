import java.awt.event.MouseEvent;

public class SquareDrawTool extends DrawTool {
    //private Square drawingSquare;

    public SquareDrawTool(ShapesDrawer shapesDrawer){
        super(shapesDrawer);
        getChooseToolBtn().setText("Квадрат");
        getChooseToolBtn().addMouseListener(new ChooseSquareBtnMouseListener(shapesDrawer));
    }

    @Override
    public void mousePressed(MouseEvent e){
        drawingShape = new Square(new Point(e.getX(), e.getY()), 1);
        createShape(drawingShape);
    }

    private class ChooseSquareBtnMouseListener extends ChooseToolBtnMouseListener{
        public ChooseSquareBtnMouseListener(ShapesDrawer shapesDrawer){
            super(shapesDrawer);
        }

        public void mousePressed(MouseEvent e){
            getShapesDrawer().setDrawTool(SquareDrawTool.this);
        }
    }
}
