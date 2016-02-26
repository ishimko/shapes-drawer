public class Triangle extends Polygon{
    public Triangle(Point topLeft, Point bottomRight){
        addPoint(topLeft);
        addPoint(new Point(topLeft.x, bottomRight.y));
        addPoint(bottomRight);
    }

    @Override
    public void refreshShape(Point point){
        setPoint(1, new Point(getTopLeft().x, point.y));
        setPoint(2, point);
    }

    private Point getTopLeft(){
        return getPoint(0);
    }


}
