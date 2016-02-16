import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FiguresDrawer extends JPanel {
    private ArrayList<Figure> figuresList;

    public FiguresDrawer(){};
    public FiguresDrawer(ArrayList<Figure> figureList) {
        this.figuresList = new ArrayList<Figure>(figureList);
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

    public void addFigure(Figure f) {
        figuresList.add(f);
    }

    public void clearList() {
        figuresList.clear();
    }
}
