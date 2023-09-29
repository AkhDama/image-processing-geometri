/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Dama Putra
 */
public class Geometri_Rotate {
    public static BufferedImage rotate(BufferedImage image){
        int width=image.getWidth(null);
        int height=image.getHeight(null);
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        Graphics2D g2=newImage.createGraphics();
        double angle = Math.toRadians(180);
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        double x0 = 0.5*(width-1); //titik rotate image
        double y0 = 0.5*(height-1); //Pertengahan image
        g2.rotate(angle,x0,y0);
        g2.drawImage(image,null,0,0);
        
        return newImage;
    }

    public static void main(String[] args){
    try{
        BufferedImage oriImage=ImageIO.read(new File ("C:\\Users\\Dama Putra\\Pictures\\ImageProcessing\\sky.jpg"));
        BufferedImage subImage=rotate(oriImage);
        File output= new File("C:\\Users\\Dama Putra\\Pictures\\ImageProcessing\\skyRotate.jpg");
        System.out.println("Successfully converted a image into a Rotate");
        ImageIO.write(subImage,"jpg",output);
        }
        catch(IOException e){
            System.out.println(e);
        }
    } 
}

