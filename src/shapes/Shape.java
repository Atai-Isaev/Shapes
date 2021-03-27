package shapes;

import javafx.scene.paint.Color;
import teaching.WhiteBoard;

public abstract class Shape implements Drawable {
    protected Object representation;
    private static WhiteBoard whiteBoard;
    private Color color;
    private boolean solid;

    public Shape() {
    }

    public Color getColor() {
        return color;
    }

    public static WhiteBoard getWhiteBoard() {
        return whiteBoard;
    }

    public boolean isSolid() {
        return solid;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public void setSolid(boolean solid) {
        this.solid = solid;
    }
}
