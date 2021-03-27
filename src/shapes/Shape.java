package shapes;

import teaching.WhiteBoard;

import java.awt.*;

public abstract class Shape implements Drawable {
    protected Object representation;
    private static final WhiteBoard whiteBoard = new WhiteBoard();
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
