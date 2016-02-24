//package src;

import java.awt.*;
import java.util.ArrayList;

public class Polyline extends Shape{
    private ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point p){
        points.add(new Point(p.x, p.y));
    }

    private int[] getXs(){
        int[] xs = new int[points.size()];

        for (int i = 0; i < points.size(); i++){
            xs[i] = points.get(i).x;
        }

        return xs;
    }

    private int[] getYs(){
        int[] ys = new int[points.size()];

        for (int i = 0; i < points.size(); i++){
            ys[i] = points.get(i).y;
        }

        return ys;
    }


    public void draw(Graphics g){
        super.draw(g);
        g.drawPolyline(getXs(), getYs(), points.size());
    }
}
