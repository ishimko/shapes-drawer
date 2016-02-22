import java.awt.*;

public class Ellipse implements Shape{
    private Point topLeft;
    private int width;
    private int height;

    public Ellipse(Point topLeft, int width, int height){
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g){
        g.drawOval(topLeft.x, topLeft.y + height, width, height);
    }
}