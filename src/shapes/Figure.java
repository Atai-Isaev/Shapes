package shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Figure implements Drawable {
    private final List<Drawable> shapes;

    public Figure() {
        this.shapes = new ArrayList<>();
    }

    public Figure addShape(Drawable drawable) {
        this.shapes.add(drawable);
        return this;
    }

    @Override
    public void draw() {
        this.shapes.forEach(Drawable::draw);
    }

    @Override
    public Drawable move(int x, int y) {
        this.shapes.forEach(drawable -> drawable.move(x, y));
        return this;
    }

    public static Figure snowMan() {
        Figure snowMan = new Figure();

        Figure hat = new Figure();
        Rectangle rect = new Rectangle(new Point(350, 500), 100, 50);
        rect.setColor(Color.BLACK);
        hat.addShape(rect);
        hat.addShape(new Line(
                new Point(275, 475),
                new Point(425, 475)
        ));
        snowMan.addShape(hat);

        Figure head = new Figure();
        head.addShape(new Circle(65, new Point(350, 410)));
        Circle nose = new Circle(5, new Point(350, 400));
        nose.setColor(Color.YELLOW);
        nose.setSolid(true);
        head.addShape(nose);
        Circle leftEye = new Circle(5, new Point(335, 420));
        leftEye.setSolid(true);
        Circle rightEye = new Circle(5, new Point(365, 420));
        rightEye.setSolid(true);
        head.addShape(leftEye);
        head.addShape(rightEye);
        snowMan.addShape(head);

        Figure body = new Figure();
        body.addShape(new Circle(100, new Point(350, 245)));
        Circle stud_1 = new Circle(5, new Point(350, 280));
        stud_1.setSolid(true);
        Circle stud_2 = new Circle(5, new Point(350, 210));
        stud_2.setSolid(true);
        body.addShape(stud_1);
        body.addShape(stud_2);
        Line leftArm = new Line(new Point(250, 245), new Point(150, 345));
        Line rightArm = new Line(new Point(450, 245), new Point(550, 345));
        body.addShape(leftArm);
        body.addShape(rightArm);
        snowMan.addShape(body);

        Figure legs = new Figure();
        legs.addShape(new Circle(140, new Point(350, 5)));
        Circle stud_3 = new Circle(5, new Point(350, 50));
        stud_3.setSolid(true);
        Circle stud_4 = new Circle(5, new Point(350, 5));
        stud_4.setSolid(true);
        Circle stud_5 = new Circle(5, new Point(350, -45));
        stud_5.setSolid(true);
        legs.addShape(stud_3);
        legs.addShape(stud_4);
        legs.addShape(stud_5);
        snowMan.addShape(legs);

        // TODO: 3/27/2021 Create a snowMan figure
        return snowMan;
    }
}
