package shapes;

import java.util.ArrayList;

public class Polygon extends Shape {
    private ArrayList<Point> points;

    public Polygon() {
        this.points = new ArrayList<>();
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    @Override
    public void draw() {
        if (!points.isEmpty()){
            getWhiteBoard().removeShape(representation);

            double[] x = new  double[points.size()];
            double[] y = new  double[points.size()];

            for (int i = 0; i < points.size(); i++) {
                x[i] = points.get(i).getX();
                y[i] = points.get(i).getY();
            }

            representation = getWhiteBoard().drawPolygon(x, y, getColor(), isSolid(), 0.0D);
        }
    }

    @Override
    public Polygon move(int x, int y) {
        points.replaceAll(point -> new Point(point.getX()+x, point.getY()+y));
        return this;
    }
}
