import draw_tools.*;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JPanel {
    static ShapesDrawer shapesDrawer = new ShapesDrawer();

    public MainWindow(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(shapesDrawer, BorderLayout.WEST);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.X_AXIS));
        buttonsPanel.add(new LineDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(new RectangleDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(new TriangleDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(new SquareDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(new EllipseDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(new CircleDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(new PolygonDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(new PolylineDrawTool(shapesDrawer).getChooseToolBtn());
        buttonsPanel.add(shapesDrawer.getUndoButton());

        add(buttonsPanel, BorderLayout.CENTER);
    }


    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Лабораторная работа №1, 2");
        mainFrame.setVisible(true);
        mainFrame.setMinimumSize(new Dimension(500, 400));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setContentPane(new MainWindow());
        mainFrame.pack();
    }
}
