package image;

import javafx.scene.paint.Color;

public class Rectangle implements Shape {
    private int width;
    private int height;
    private int x;
    private int y;
    private Color color;

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public boolean contains(Point point) {
    Point point1 = new Point(this.x,this.y);
    point = new Point(x,y);
    return point1.equals(point);

    }
    @Override
    public Color getColor() {
        return this.color;

    }

}
