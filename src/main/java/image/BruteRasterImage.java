package image;

import javafx.scene.paint.Color;



public class BruteRasterImage extends RasterImage {
    private Color[][] pixels;

    public BruteRasterImage(Color color,int width, int height ) {
        super(width, height);
        createRepresentation();
            pixels = new Color[width][height];
        for(int x=0 ; x<width ; x++){
            for(int y=0 ; y<height ; y++){pixels[x][y]=color;
            }
        };
    }

    public BruteRasterImage(Color[][]colors){
        super(colors.length, colors[0].length);
        createRepresentation();
        this.pixels = colors.clone();
    }


    public void createRepresentation(){
        this.pixels= new Color[getWidth()][getHeight()];
    }
    public void setPixelColor(Color color , int x , int y){
        this.pixels[x][y] = color;
    }
    @Override
    public Color getPixelColor(int x, int y) {
        return this.pixels[x][y];
    }

    public void setPixelsColor(Color[][] pixels){
        this.pixels= pixels;
    }
    public void setPixelsColor(Color color) {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                this.pixels[x][y] = color;
            }
        }
    }
}
