package shapes;

import teaching.WhiteBoard;

import java.awt.*;

public abstract class Shape implements Drawable {
    protected Object representation;
    private static WhiteBoard whiteBoard;
    private Color color;
    private boolean solid;

    public Shape() {
        whiteBoard = new WhiteBoard();
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
