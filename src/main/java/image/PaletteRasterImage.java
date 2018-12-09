package image;

import javafx.scene.paint.Color;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
                createRepresentation();
                setPixelColor(color , x ,y);
                setPixelsColor(color);
                this.indexOfColors[x][y]=palette.indexOf(color);

            }

        }
    }

    public  PaletteRasterImage(Color[][]colors){
        this.width=colors.length;
        this.height=colors[0].length;

        for(int x=0;x<this.width;x++){
                for(int y=0;y<this.height;y++){

                createRepresentation();

                setPixelsColor(colors[width][height]);

                this.indexOfColors[x][y]=palette.indexOf(colors[x][y]);







            }
        }

    }


    public void createRepresentation() {
        this.palette = new ArrayList<>();


        this.indexOfColors = new int[width][height];


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
        for(int x =0 ; x<this.width ; x++){
            for(int y=0 ; y<this.height ; y++){
        this.indexOfColors[x][y]=palette.indexOf(pixels);
            }
        }
    }
    public void setPixelsColor(Color color){
        for(int x =0 ; x<this.width ; x++){
            for(int y=0 ; y<this.height ; y++){
                indexOfColors[x][y]=palette.indexOf(color);

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
