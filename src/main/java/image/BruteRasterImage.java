package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {
    private int width;
    private int height;

    private Color[][] pixels;

    public BruteRasterImage(Color color,int width, int height ) {
        this.width = width;
        this.height = height;

        for(int x=0 ; x<width ; x++){
            for(int y=0 ; y<height ; y++){pixels[x][y]=color;
            }
        };
    }

    public BruteRasterImage(Color[][]colors){
        this.pixels = colors.clone();
    }
    public void createRepresentation(){
        pixels= new Color[width][height];
    }
    @Override
    public Color getPixelColor(int x, int y) {
        return this.pixels[x][y]  ;
    }
    public void setPixelColor(Color color , int x , int y){
        this.pixels[x][y] = color;
    }
    public void setPixelsColor(Color[][] pixels){
        this.pixels = pixels;
    }
    public void setPixelsColor(Color color){
        for(int x =0 ; x<width ; x++){
            for(int y=0 ; y<height ; y++){
                this.pixels[x][y]=color;
            }
        }
    }
    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }
    protected void setWidth(int width){
    this.width = width;
    }
    protected void setHeight(int height){
        this.height= height;
    }
}
