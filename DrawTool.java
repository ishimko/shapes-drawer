import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class DrawTool extends MouseAdapter {
    private ShapesDrawer shapesDrawer;
    private JButton chooseToolBtn = new JButton();

    public JButton getChooseToolBtn(){
        return chooseToolBtn;
    }

    public DrawTool(ShapesDrawer shapesDrawer){
        this.shapesDrawer = shapesDrawer;
    }

    protected void createShape(Shape shape){
        shapesDrawer.addShape(shape);
        shapesDrawer.draw();
    }

    public ShapesDrawer getShapesDrawer(){
        return this.shapesDrawer;
    }

    public abstract void mousePressed(MouseEvent e);

    public abstract void mouseDragged(MouseEvent e);
}
