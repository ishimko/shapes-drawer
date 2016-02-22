//package src;

import javax.swing.*;

public class MainWindow {
    public static void main(String[] args) {
        ShapesDrawer shapesDrawer = new ShapesDrawer();
        shapesDrawer.addShape(new Rectangle(new Point(10, 10), 10, 10));
        shapesDrawer.addShape(new Line(new Point(0, 0), new Point(100,100)));

        JFrame mainFrame = new JFrame("Лабораторная работа №1");
        mainFrame.setVisible(true);
        mainFrame.setSize(300, 200);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.add(shapesDrawer);
    }
}
