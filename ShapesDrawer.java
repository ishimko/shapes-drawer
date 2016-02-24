//package src;

import javax.swing.*;
import java.awt.*;
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

    public void addShape(Shape f) {
        shapesList.add(f);
    }
}
