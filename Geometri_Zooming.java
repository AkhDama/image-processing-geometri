/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Dama Putra
 */
public class Geometri_Zooming {
    public void zooming() throws IOException{
        BufferedImage image=ImageIO.read(new File("C:\\Users\\Dama Putra\\Pictures\\ImageProcessing\\kuda.jpg"));
        int height = image.getHeight(null);
        int width = image.getWidth(null);
        BufferedImage zimage = new BufferedImage(width*2, height*2, BufferedImage.TYPE_INT_RGB);
        Graphics2D g=zimage.createGraphics();
        AffineTransform httpswwwmbajavacom=AffineTransform.getScaleInstance(0.5,0.5);
        g.drawRenderedImage(image, httpswwwmbajavacom);
        ImageIO.write(zimage, "jpg", new File("C:\\Users\\Dama Putra\\Pictures\\ImageProcessing\\kudaZoomIN.jpg"));
    }    
    
    public static void main(String[] args) throws Exception{
        Geometri_Zooming e = new Geometri_Zooming();
        e.zooming();
        System.out.println("Successfully converted a image into a Zooming");
    }
}
