package image;

import javafx.scene.paint.Color;

import java.util.List;

public class PaletteRasterImage implements Image {
    private int width;
    private int height;
    private List<Color> palette;
    private int[][] indexOfColors;

    public PaletteRasterImage(Color color,int width, int height ) {
        this.width = width;
        this.height = height;
        for(int x=0;  x<width;x++){
            for(int y=0;y<height;y++){

                setPixelColor(color , x ,y);

            }

        };
    }

    public  PaletteRasterImage(Color[][]colors){
        this.width=colors.length;
        this.height=colors[0].length;
        for(int index=0;index<=width;index++){
            for(int index2=0;index<=height;index2++){
                setPixelsColor(colors[index][index2]);
            }
        }

    }


    public void createRepresentation(){
         = new Color[width][height];
    }
    public void setPixelColor(Color color , int x , int y){
        if(!palette.contains(color))
            palette.add(indexOfColors[x][y] , color);


    }
    @Override
    public Color getPixelColor(int x, int y) {
        return 
    }

    public void setPixelsColor(Color[][] pixels){
        palette.add(pixels[width][height]);
    }
    public void setPixelsColor(Color color){
        for(int x =0 ; x<this.width ; x++){
            for(int y=0 ; y<this.height ; y++){
                setPixelColor(color , x , y);

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
