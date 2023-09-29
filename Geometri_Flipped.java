/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Dama Putra
 */
public class Geometri_Flipped {
    public static final int FLIP_VERTICAL=1;
    public static final int FLIP_HORIZONTAL=-1;
    
    public static void flip(File input, File output, int direction) throws IOException {
        try{
            BufferedImage image=ImageIO.read(input);
            int height = image.getHeight();
            int width = image.getWidth();
            BufferedImage flip = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            for (int y = 0; y < height; y++){
                for (int x = 0; x < width; x++){
                    switch(direction){
                        case FLIP_HORIZONTAL:
                            flip.setRGB((width-1) -x, y, image.getRGB(x, y));
                            break;
                        case FLIP_VERTICAL:
                            flip.setRGB(x, (height-1)-y, image.getRGB(x, y));
                            break;
                    }
                }
            }
            ImageIO.write(flip,"jpg",output);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
   
    public static void main(String args[]) throws IOException {
        File input = new File("C:\\Users\\Dama Putra\\Pictures\\ImageProcessing\\contractor.jpg");
        File output= new File("C:\\Users\\Dama Putra\\Pictures\\ImageProcessing\\contractorFlipHZ.jpg");
        Geometri_Flipped.flip(input, output, Geometri_Flipped.FLIP_HORIZONTAL);
        System.out.println("Successfully converted a image into a Vertical Flip");
    }
}    
