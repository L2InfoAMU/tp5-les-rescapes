package image;

import javafx.scene.paint.Color;

public class Rectangle implements Shape {
    private int width;
    private int height;
    private int x;
    private int y;
    private Color color;

    public Rectangle(int width, int height, int x, int y, Color color) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public boolean contains(Point point) {
        return this.x < x && x <= this.x+width && this.y<y && y<= this.y+height;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
