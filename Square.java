public class Square extends Rectangle {
    public Square(Point bottomLeft, int side) {
        super(bottomLeft, side, side);
    }

    @Override
    public void refreshShape(Point bottomRight) {
        int side = Math.abs(getPoint(0).x - bottomRight.x);
        int deltaY = side * (int)Math.signum(bottomRight.y - getPoint(0).y);
        super.refreshShape(new Point(bottomRight.x, getPoint(0).y + deltaY));
    }

}
