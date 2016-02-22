//package src;

import javax.swing.*;

public class MainWindow {
    public static void main(String[] args) {
        ShapesDrawer shapesDrawer = new ShapesDrawer();
        shapesDrawer.addShape(new Rectangle(new Point(10, 10), 10, 10));
        shapesDrawer.addShape(new Line(new Point(0, 0), new Point(100,100)));
        shapesDrawer.addShape(new Square(new Point(150, 150), 100));
        shapesDrawer.addShape(new Triangle(new Point(0, 0), new Point(0, 20), new Point(20, 0)));
        shapesDrawer.addShape(new Circle(new Point(50, 50), 50));
        shapesDrawer.addShape(new Ellipse(new Point(0, 50), 100, 150));

        JFrame mainFrame = new JFrame("Лабораторная работа №1");
        mainFrame.setVisible(true);
        mainFrame.setSize(300, 200);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.add(shapesDrawer);
    }
}
