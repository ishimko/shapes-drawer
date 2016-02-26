import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class ChooseToolBtnMouseListener extends MouseAdapter {
    private ShapesDrawer shapesDrawer;

    public ChooseToolBtnMouseListener(ShapesDrawer shapesDrawer) {
        this.shapesDrawer = shapesDrawer;
    }

    public abstract void mousePressed(MouseEvent e);

    protected ShapesDrawer getShapesDrawer(){
        return shapesDrawer;
    }
}
