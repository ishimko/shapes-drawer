public class Triangle extends Polyline{
    public Triangle(Point a, Point b, Point c){
        addPoint(a);
        addPoint(b);
        addPoint(c);
        addPoint(a);
    }
}
