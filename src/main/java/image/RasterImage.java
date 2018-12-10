package image;

import javafx.scene.paint.Color;

public abstract class RasterImage implements Image {
   private int width;
    private int height;

    public RasterImage(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public abstract Color getPixelColor(int x, int y);

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    protected void setWidth(int width){
        this.width= width;
    }

    protected void setHeight(int height){
        this.height = height;
    }
}