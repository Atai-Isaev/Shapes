package shapes;

import exception.CircleRadiusIsNegativeException;

import java.awt.*;

public class Circle extends Shape{
    private int radius;
    private Point center;

    public Circle(int radius, Point point) throws CircleRadiusIsNegativeException{
        try{
            if (radius>0){
                this.radius = radius;
                this.center = point;
            }else throw new CircleRadiusIsNegativeException("The radius of the circle is zero or less than zero!");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Parameter radius or koordinates of center point is NULL!");
        }

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
