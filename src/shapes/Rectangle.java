package shapes;

import exception.RectangleShapeException;

public class Rectangle extends Polygon {
    private int lengthX;
    private int lengthY;
    private Point point;

    public Rectangle(Point bottomLeft, int lx, int ly) throws RectangleShapeException {
        if (lx <= 0 || ly <= 0)
            throw new RectangleShapeException("Rectangle height and width can't be negative or 0!");
        this.lengthX = lx;
        this.lengthY = ly;
        this.point = bottomLeft;
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
