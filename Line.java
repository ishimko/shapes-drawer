public class Line extends Polyline {
    public Line(Point p){
        addPoint(p);
        addPoint(p);
    }

    public Line(Point a, Point b){
        addPoint(a);
        addPoint(b);
    }


    public void setFinishPoint(Point finishPoint){
        replacePoint(1, finishPoint);
    }
}
