package image;

import javafx.scene.paint.Color;

import java.util.List;

public class PaletteRasterImage implements Image {
    private int width;
    private int height;
    private List<Color> palette;
    private byte[][] indexOfColors;

    public PaletteRasterImage(Color color,int width, int height ) {
        this.width = width;
        this.height = height;
        indexOfColors = new byte[width][height];
        for(int x=0 ; x<width ; x++){
            for(int y=0 ; y<height ; y++){indexOfColors[x][y] ;
            }
        };
    }

    public  PaletteRasterImage(Color[][]colors){
        this.palette = colors.clone();
        this.width=colors.length;
        this.height=colors[0].length;
    }


    public void createRepresentation(){
        this.indexOfColors= new Color[width][height];
    }
    public void setPixelColor(Color color , int x , int y){

                if(palette=)


    }
    @Override
    public Color getPixelColor(int x, int y) {
        return this.indexOfColors[x][y];
    }

    public void setPixelsColor(Color[][] pixels){
        this.indexOfColors= pixels;
    }
    public void setPixelsColor(Color color){
        for(int x =0 ; x<this.width ; x++){
            for(int y=0 ; y<this.height ; y++){
                this.indexOfColors[x][y]=color;
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
