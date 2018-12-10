package image;

import javafx.scene.paint.Color;
import java.util.HashMap;
import java.util.Map;


public class SparseRasterImage extends RasterImage {
 private Map<Point, Color> pixelsMap;

    public SparseRasterImage(Color color,int width, int height) {
        super(width, height);

        createRepresentation();
        setPixelsColor(color);

    }
    public SparseRasterImage(Color[][] pixels){
        super(pixels.length, pixels[0].length);
        createRepresentation();
        setPixelsColor(pixels);
    }

    public void createRepresentation(){
        pixelsMap = new HashMap<>();
    }

    public void setPixelColor(Color color , int x , int y){
        pixelsMap.put(new Point(x,y) , color);

    }
    public Color getPixelColor(int x, int y) {
        Color result = pixelsMap.get(new Point(x,y));
        if(result==null)
            result = Color.WHITE;
        return result;
    }
    public void setPixelsColor(Color[][] pixels) {

        for (int x = 0; x <getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {

                pixelsMap.put(new Point(x, y), pixels[x][y]);
            }
        }
    }
    private void setPixelsColor(Color color){
        for (int x = 0; x <getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {


                pixelsMap.put(new Point(x, y), color);
            }
        }

    }

}
