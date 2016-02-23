import java.awt.*;

public class Ellipse extends Shape{
    private Point topLeft;
    private int width;
    private int height;

    public Ellipse(Point topLeft, int width, int height){
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g){
        super.draw(g);
        g.drawOval(topLeft.x, topLeft.y + height, width, height);
    }
}
