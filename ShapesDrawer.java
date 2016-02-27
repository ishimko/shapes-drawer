import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.*;
import java.util.List;

public class ShapesDrawer extends JPanel {
    private List<Shape> shapesList =  new ArrayList<>();
    DrawTool drawTool;

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

    private void removeListeners(){
        removeMouseListener(drawTool);
        removeMouseMotionListener(drawTool);
    }

    public void setDrawTool(DrawTool drawTool){
        if (this.drawTool != null) {
            this.drawTool.finishDrawing();
        }
        removeListeners();
        this.drawTool = drawTool;
        addMouseListener(drawTool);
        addMouseMotionListener(drawTool);
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
