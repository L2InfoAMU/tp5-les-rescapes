package image;

import javafx.scene.paint.Color;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaletteRasterImage extends RasterImage {
    private List<Color> palette;
    private int[][] indexOfColors;

    public PaletteRasterImage(Color color,int width, int height ) {
        super(width, height);
        createRepresentation();
        setPixelsColor(color);
    }

    public  PaletteRasterImage(Color[][]colors){
        super(colors.length, colors[0].length);
        createRepresentation();
        setPixelsColor(colors);
    }


    public void createRepresentation() {
        this.palette = new ArrayList<>();


        this.indexOfColors = new int[getWidth()][getHeight()];


    }




    public void setPixelColor(Color color , int x , int y){
        if(!palette.contains(color)) {
            palette.add(indexOfColors[x][y], color);
        }
        this.indexOfColors[x][y]=palette.indexOf(color);


    }
    @Override
    public Color getPixelColor(int x, int y) {
        return  palette.get(indexOfColors[x][y]) ;
    }

    public void setPixelsColor(Color[][] pixels){
        for(int x =0 ; x<getWidth() ; x++){
            for(int y=0 ; y<getHeight() ; y++){
                if(!palette.contains(pixels[x][y])){
                    palette.add(pixels[x][y]);
                }
                this.indexOfColors[x][y]=palette.indexOf(pixels[x][y]);
            }
        }
    }
    public void setPixelsColor(Color color){
        if(!palette.contains(color)){
            palette.add(color);
        }
        for(int x =0 ; x<this.getWidth() ; x++){
                for(int y=0 ; y<getHeight() ; y++){
               this.indexOfColors[x][y]=palette.indexOf(color);

            }
        }
    }
}
