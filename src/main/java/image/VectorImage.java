package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class VectorImage implements Image {
    private List<Shape> shapes;
    private int width;
    private int height;

    public VectorImage(List<Shape> shapes, int width, int height) {
        this.width = width;
        this.height = height;
        this.shapes = shapes;





    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        for (Shape shape : shapes) {
            if (shape.contains(new Point(x, y))) return shape.getColor();


        }
        return Color.WHITE;
    }
    protected int setWidth(int width){
       return this.width=width;
    }
    protected int setHeight(int height){
        return this.height=height;
    }
}
