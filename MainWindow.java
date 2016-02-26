//package src;

import javax.swing.*;
import java.awt.*;

public class MainWindow {
    private static ShapesDrawer shapesDrawer = new ShapesDrawer();
    static {
        Rectangle rect = new Rectangle(new Point(10, 10), 10, 10);
        rect.setBorderColor(Color.CYAN);
        shapesDrawer.addShape(rect);

        Line l = new Line(new Point(0, 0), new Point(100, 20));
        l.setBorderColor(Color.green);
        shapesDrawer.addShape(l);

        Line l1 = new Line(new Point(50, 50), new Point(100, 200));
        l1.setBorderColor(Color.black);
        shapesDrawer.addShape(l1);

        shapesDrawer.addShape(new Square(new Point(150, 150), 100));
       // shapesDrawer.addShape(new Triangle(new Point(0, 0), new Point(0, 20), new Point(20, 0)));
        shapesDrawer.addShape(new Circle(new Point(50, 50), 50));

        Ellipse e = new Ellipse(new Point(0, 50), 100, 150);
        e.setBorderColor(Color.MAGENTA);
        shapesDrawer.addShape(e);

    }
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Лабораторная работа №1");
        mainFrame.setVisible(true);
        mainFrame.setSize(500, 400);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLayout(new GridLayout());
        mainFrame.setLocationRelativeTo(null);

       // RectangleDrawTool rectangleDrawTool = new RectangleDrawTool(shapesDrawer);

        //shapesDrawer.addMouseListener(rectangleDrawTool);
        //shapesDrawer.addMouseMotionListener(rectangleDrawTool);
        //LineDrawTool lineDrawTool = new LineDrawTool(shapesDrawer);
//        shapesDrawer.addMouseListener(lineDrawTool);
//        shapesDrawer.addMouseMotionListener(lineDrawTool);



        JPanel buttonsPanel = new JPanel();
        mainFrame.add(buttonsPanel);
        buttonsPanel.add(new LineDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(new RectangleDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(new TriangleDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(new SquareDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(new EllipseDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(new CircleDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(new PolygonDrawTool(shapesDrawer).getChooseToolBtn());

        buttonsPanel.add(shapesDrawer.getUndoButton());

        mainFrame.add(shapesDrawer);
        mainFrame.add(buttonsPanel);
    }
}
