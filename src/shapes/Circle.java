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
        if (getColor() == null) draw(Color.BLACK, isSolid());
        else draw(getColor(), isSolid());
    }

    @Override
    public Drawable move(int x, int y) {
        this.center = new Point(x,y);
        return this;
    }
}
