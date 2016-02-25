public class Circle extends Ellipse {
    public Circle(Point center, int radius){
        super(new Point(center.x - radius, center.y - radius), radius*2, radius*2);
    }

    @Override
    public void refreshShape(Point point){
//        int side = Math.abs(getTopLeft().x - point.x);
//        int deltaY = side * (int)Math.signum(point.y - getTopLeft().y);
//
//        super.refreshShape(new Point(point.x, getBottomRight().y + deltaY));
    }
}
