import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class ChooseToolBtnMouseListener extends MouseAdapter {
    private ShapesDrawer shapesDrawer;

    public ChooseToolBtnMouseListener(ShapesDrawer shapesDrawer) {
        this.shapesDrawer = shapesDrawer;
    }

    protected void removeListeners() {
        shapesDrawer.removeMouseListener(shapesDrawer.getMouseListener());
        shapesDrawer.removeMouseMotionListener(shapesDrawer.getMouseMotionListener());
    }

    public abstract void mousePressed(MouseEvent e);

    protected ShapesDrawer getShapesDrawer(){
        return shapesDrawer;
    }
}
