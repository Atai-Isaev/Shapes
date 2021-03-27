import exception.PolygonShapeException;
import shapes.Figure;
import shapes.Point;
import shapes.Polygon;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) throws Exception {

        Figure sm = Figure.snowMan();
        sm.draw();

        //Start Testing Polygon class
        Point p1 = new Point(400, 500);
        Point p2 = new Point(300, 600);
        Point p3 = new Point(220, 120);

        ArrayList<Point> point3List = new ArrayList<>();

        ArrayList<Point> point1List = new ArrayList<>();

        ArrayList<Point> point0List = new ArrayList<>();

        point1List.add(p1);

        point3List.add(p1);
        point3List.add(p2);
        point3List.add(p3);

        //Testing polygon with 3 Points
        Polygon polygon3Points = new Polygon();
        polygon3Points.setPoints(point3List);
        polygon3Points.draw();

        //Testing draw()-method after move()-method
        Polygon polygon3PointAfterMoving = new Polygon();
        polygon3PointAfterMoving.setPoints(point3List);
        polygon3PointAfterMoving.move(300, 0);
        polygon3PointAfterMoving.draw();

        //Testing polygon with 1 Point
//        Polygon polygon1Point = new Polygon();
//        polygon1Point.setPoints(point1List);
//        polygon1Point.draw();

        //Testing polygon with empty list
        Polygon polygon0Point = new Polygon();
        polygon0Point.setPoints(point0List);
        polygon0Point.draw();

        //Testing setPoints()-method on null value
        Polygon polygonNullParam = new Polygon();
        polygonNullParam.setPoints(null);
        //End Testing Polygon class
    }
}
