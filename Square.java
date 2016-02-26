public class Square extends Rectangle {
    public Square(Point bottomLeft, int side) {
        super(bottomLeft, side, side);
    }

    @Override
    public void refreshShape(Point point) {
        int height = Math.abs(getPoint(0).y - point.y);
        int width = Math.abs(getPoint(0).x - point.x);

        if (width < height){
            int deltaY = width * (int)Math.signum(point.y - getPoint(0).y);
            super.refreshShape(new Point(point.x, getPoint(0).y + deltaY));
        } else {
            int deltaX = height * (int)Math.signum(point.x - getPoint(0).x);
            super.refreshShape(new Point(getPoint(0).x + deltaX, point.y));
        }
    }

}
