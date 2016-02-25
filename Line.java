public class Line extends Polyline {
    public Line(Point p){
        addPoint(p);
        addPoint(p);
    }

    public Line(Point a, Point b){
        addPoint(a);
        addPoint(b);
    }

    @Override
    public void refreshShape(Point finishPoint){
        setPoint(1, finishPoint);
    }
}
