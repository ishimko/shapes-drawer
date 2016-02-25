//package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class ShapesDrawer extends JPanel {
    private ArrayList<Shape> shapesList =  new ArrayList<>();

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

    public void addShape(Shape f) {
        shapesList.add(f);
    }
}
