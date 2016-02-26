import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class ShapesDrawer extends JPanel {
    private ArrayList<Shape> shapesList =  new ArrayList<>();

    public ShapesDrawer(){
        setBackground(Color.WHITE);
    }

    private JButton undoButton = new JButton("Отмена");
    {
        undoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                removeLast();
            }
        });
    }

    public JButton getUndoButton(){
        return undoButton;
    }

    public void draw(){
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapesList){
            shape.draw(g);
        }
    }

    public MouseListener getMouseListener(){
        MouseListener[] mouseListeners = getMouseListeners();
        if (mouseListeners.length > 0){
            return mouseListeners[0];
        } else {
            return null;
        }
    }

    public MouseMotionListener getMouseMotionListener(){
        MouseMotionListener[] mouseMotionListeners = getMouseMotionListeners();
        if (mouseMotionListeners.length > 0){
            return mouseMotionListeners[0];
        } else {
            return null;
        }
    }

    private void removeLast(){
        if (shapesList.size() > 0) {
            shapesList.remove(shapesList.size() - 1);
        }
        draw();
    }

    public void addShape(Shape f) {
        shapesList.add(f);
    }
}
