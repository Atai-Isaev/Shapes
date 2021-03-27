package shapes;

import java.awt.*;

public class Circle extends Shape{
    private final int radius;
    private Point center;

    public Circle(int radius, Point point) {
        this.radius = radius;
        this.center = point;
    }

    public void draw(Color color, boolean solid){
        getWhiteBoard().drawCircle(center.getX(), center.getY(), radius, color, solid);
    }

    @Override
    public void draw() {
        getWhiteBoard().drawCircle(center.getX(), center.getY(),radius);
    }

    @Override
    public Drawable move(int x, int y) {
        this.center = new Point(x,y);
        return this;
    }
}
