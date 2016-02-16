import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShapesDrawer extends JPanel {
    private ArrayList<Shape> shapesList =  new ArrayList<>();

    /*public ShapesDrawer(ArrayList<Shape> shapesList){
        this.shapesList = (ArrayList<Shape>)shapesList.clone();
    }*/

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < shapesList.size(); i++) {
            shapesList.get(i).draw(g);
        }
    }

    public void addShape(Shape f) {
        shapesList.add(f);
    }

    public void clearList() {
        shapesList.clear();
    }
}
