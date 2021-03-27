package shapes;

import java.util.ArrayList;

public class Polygon extends Shape{
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

    }

    @Override
    public Drawable move(int x, int y) {
        return null;
    }
}
