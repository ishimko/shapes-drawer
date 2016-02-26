public class Rectangle extends Polygon {
    public Rectangle(Point topLeft, int width, int height){
        addPoint(new Point(topLeft.x, topLeft.y));
        addPoint(new Point(topLeft.x + width, topLeft.y));
        addPoint(new Point(topLeft.x + width, topLeft.y + height));
        addPoint(new Point(topLeft.x, topLeft.y + height));
    }

    @Override
    public void refreshShape(Point point){
        setPoint(1, new Point(point.x, getPoint(0).y));
        setPoint(2, point);
        setPoint(3, new Point(getPoint(0).x, point.y));
    }

//    protected int getWidth(){
//        return Math.abs(getTopLeft().x - getPoint(1).x)
//    }
//
//    protected int getHeight(){
//        return Math.abs(getTopLeft().y - getPoint(1).y)
//    }
}
