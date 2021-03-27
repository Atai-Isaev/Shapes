package shapes;

public class Line extends Polygon{
   private final Point start;
   private final Point end;

    public Line(Point start, Point end) throws NullPointerException{
        this.start = start;
        this.end = end;
    }

    @Override
    public void draw() {
        getWhiteBoard().removeShape(representation);
        getWhiteBoard().drawLine(start.getX(), start.getY(), end.getX(), end.getY());
    }
}
