package shapes;

import java.awt.*;

public class Line extends Polygon{
   private Point point1;
   private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public void draw() {
        getWhiteBoard().removeShape(representation);
        getWhiteBoard().drawLine(point1.getX(),point1.getY(),point2.getX(),point2.getY());
    }

    /**
     * Drawing Line with color
     * @param  color of line
     */
    public void draw(Color color) {
        getWhiteBoard().removeShape(representation);
        getWhiteBoard().drawLine(point1.getX(),point1.getY(),point2.getX(),point2.getY(),color);
    }


}
