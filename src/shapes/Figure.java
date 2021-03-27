package shapes;

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
        // TODO: 3/27/2021 Create a snowMan figure
        return snowMan;
    }
}
