package shapes;

import java.awt.*;
import java.util.ArrayList;

public class Polyline extends Shape{
    private ArrayList<Point> points = new ArrayList<>();

    public  Polyline(){}

    public Polyline(Point point){
        points.add(point);
    }

    public void addPoint(Point p){
        points.add(p);
    }

    protected void setPoint(int i, Point newPoint){
        if (i < points.size()){
            points.set(i, newPoint);
        } else {
            if (i == points.size()){
                addPoint(newPoint);
            }
        }
    }

    protected int[] getXs(){
        return points.stream().mapToInt((s) -> s.x).toArray();
    }

    protected int[] getYs(){
        return points.stream().mapToInt((s) -> s.y).toArray();
    }

    public Point getPoint(int i){
        return points.get(i);
    }

    public int getPointsCount(){
        return points.size();
    }


    @Override
    public void refreshShape(Point p){
        addPoint(p);
    }

    public void setFinishPoint(Point point){
        if (getPointsCount() < 2){
            addPoint(point);
        } else {
            setPoint(getPointsCount() - 1, point);
        }
    }

    public void removeLastPoint(){
        if (points.size() > 0){
            points.remove(points.size() - 1);
        }
    }

    public void draw(Graphics g){
        g.setColor(getBorderColor());
        g.drawPolyline(getXs(), getYs(), getPointsCount());//Stream java 8
    }
}
