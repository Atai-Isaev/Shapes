package shapes;

public class Line extends Polygon{
   private Point point1;
   private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
}