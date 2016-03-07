package draw_tools;

import shapes.Point;
import shapes.Shape;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class DrawTool extends MouseAdapter {
    private ShapesDrawer shapesDrawer;
    private JButton chooseToolBtn = new JButton();
    protected Shape drawingShape;

    public JButton getChooseToolBtn() {
        return chooseToolBtn;
    }

    public DrawTool(ShapesDrawer shapesDrawer) {
        this.shapesDrawer = shapesDrawer;
    }

    protected void createShape(Shape shape) {
        shapesDrawer.addShape(shape);
        shapesDrawer.draw();
    }

    public abstract void mousePressed(MouseEvent e);

    public void finishDrawing() {
    }

    public void mouseDragged(MouseEvent e) {
        drawingShape.refreshShape(new Point(e));
        shapesDrawer.draw();
    }

    protected ShapesDrawer getShapesDrawer() {
        return shapesDrawer;
    }
}
