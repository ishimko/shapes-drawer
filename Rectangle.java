import java.awt.*;

public class Rectangle implements Figure{
    Point bottomLeft;
    int width, height;

    public Rectangle(Point bottomLeft, int width, int height){
        this.bottomLeft = bottomLeft;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.drawRect(bottomLeft.x, bottomLeft.y, width, height);
    }
}
