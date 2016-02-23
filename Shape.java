import java.awt.*;

public abstract class Shape {
    private Color borderColor;

    public Shape(){
        borderColor = Color.BLACK;
    }

    public Color getBorderColor(){
        return borderColor;
    }

    public void setBorderColor(Color borderColor){
        this.borderColor = borderColor;
    }

    public void draw(Graphics g){
        g.setColor(getBorderColor());
    }
}