import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class ChooseToolBtnMouseListener extends MouseAdapter {
    protected ShapesDrawer shapesDrawer;

    public ChooseToolBtnMouseListener(ShapesDrawer shapesDrawer) {
        this.shapesDrawer = shapesDrawer;
    }

    protected void removeListeners() {
        shapesDrawer.removeMouseListener(shapesDrawer.getMouseListener());
        shapesDrawer.removeMouseMotionListener(shapesDrawer.getMouseMotionListener());
    }

    public abstract void mousePressed(MouseEvent e);
}
