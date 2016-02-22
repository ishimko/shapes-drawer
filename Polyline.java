//package src;

import java.awt.*;
import java.util.ArrayList;

public class Polyline implements Shape{
    protected ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point p){
        points.add(p);
    }

    private int[] getXs(){
        int xs[] = new int[1];

        for (int i = 0; i < points.size(); i++){
            xs[i] = points.get(i).x;
        }

        return xs;
    }

    private int[] getYs(){
        int ys[] = new int[1];
        for (int i = 0; i < points.size(); i++){
            ys[i] = points.get(i).y;
        }

        return ys;
    }

    public void draw(Graphics g){
        g.drawPolyline(getXs(), getYs(), points.size());
    }
}
