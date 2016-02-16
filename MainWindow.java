import javax.swing.*;
import java.awt.*;


public class MainWindow {
    static ShapesDrawer shapesDrawer = new ShapesDrawer();
    static {
        shapesDrawer.addShape(new Rectangle(new Point(10, 10), 50, 70));
        shapesDrawer.addShape(new Line(new Point(0, 0), new Point(200, 100)));
    }
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Лабораторная работа №1");
        mainFrame.setVisible(true);
        mainFrame.setSize(300, 200);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(shapesDrawer);
    }
}
