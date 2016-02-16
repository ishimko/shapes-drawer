import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShapesDrawer extends JPanel {
    private ArrayList<Shape> figuresList;

    public ShapesDrawer(){};
    public ShapesDrawer(ArrayList<Shape> shapeList) {
        this.figuresList = new ArrayList<Shape>(shapeList);
    }

    public void draw() {
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < figuresList.size(); i++) {
            figuresList.get(i).draw(g);
        }
    }

    public void addFigure(Shape f) {
        figuresList.add(f);
    }

    public void clearList() {
        figuresList.clear();
    }
}
