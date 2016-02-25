public class Triangle extends Polygon{
    public Triangle(Point topLeft, Point bottomRight){
        addPoint(topLeft);
        addPoint(new Point(topLeft.x, bottomRight.y));
        addPoint(bottomRight);
    }

    @Override
    public void refreshShape(Point bottomRight){
        setPoint(1, new Point(getTopLeft().x, bottomRight.y));
        setPoint(2, bottomRight);
    }

    private Point getTopLeft(){
        return getPoint(0);
    }


}
