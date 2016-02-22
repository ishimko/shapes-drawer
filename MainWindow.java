//package src;

import javax.swing.*;

public class MainWindow {
    public static void main(String[] args) {
        System.out.println("Hello");

        ShapesDrawer shapesDrawer = new ShapesDrawer();
        shapesDrawer.addShape(new Rectangle(new Point(10, 10), 50, 70));

        JFrame mainFrame = new JFrame("Лабораторная работа №1");
        mainFrame.setVisible(true);
        mainFrame.setSize(300, 200);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(shapesDrawer);
    }
}
