package shapes;

public class Rectangle extends Polygon {
    private int lengthX;
    private int lengthY;
    private Point point;

    public Rectangle(Point point, int lengthX, int lengthY) {
        this.lengthX = lengthX;
        this.lengthY = lengthY;
        this.point = point;
    }

    @Override
    public void draw() {
        getWhiteBoard().removeShape(representation);
        representation = getWhiteBoard().drawRectangle(point.getX(), point.getY(), lengthX, lengthY, getColor(), isSolid(), 0.0D);
    }

    @Override
    public Polygon move(int dx, int dy) {
        point.move(dx, dy);
        return this;
    }
}
