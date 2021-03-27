package shapes;

import exception.PolygonShapeException;

import java.util.ArrayList;

public class Polygon extends Shape {
    private ArrayList<Point> points;

    public Polygon() {
        this.points = new ArrayList<>();
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> p) throws PolygonShapeException {
        try {
            if (p.size() >= 2) this.points = p;
            else throw new PolygonShapeException("List size is lower then 2 Points.");
        } catch (NullPointerException e) {
            System.out.println("Parameter in method setPoints() is 'null'!");
        }

    }

    @Override
    public void draw() {
        if (points.size() >= 2) {
            getWhiteBoard().removeShape(representation);

            double[] x = new double[points.size()];
            double[] y = new double[points.size()];

            for (int i = 0; i < points.size(); i++) {
                x[i] = points.get(i).getX();
                y[i] = points.get(i).getY();
            }

            representation = getWhiteBoard().drawPolygon(x, y, getColor(), isSolid(), 0.0D);
        }
    }

    @Override
    public Polygon move(int dx, int dy) {
        points.replaceAll(point -> new Point(point.getX() + dx, point.getY() + dy));
        return this;
    }
}
