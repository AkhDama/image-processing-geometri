/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;

import static imageprocessing.Geometri_Flipped.FLIP_HORIZONTAL;
import static imageprocessing.Geometri_Flipped.FLIP_VERTICAL;
import java.awt.Color;
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
public class Geometri_Translasi {
   public static BufferedImage rotate(BufferedImage image){
        int width=image.getWidth(null);
        int height=image.getHeight(null);
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g=newImage.createGraphics();
        AffineTransform trans=new AffineTransform();
        trans.translate(width/2, height/2);
        AffineTransform trans2=new AffineTransform();
        double x0=1;
        double y0=2;
        trans2.translate(x0,y0);
        Graphics2D g2=(Graphics2D)g;
        g2.drawImage(newImage,trans2,null);
//        
//        return newImage;
//        int width=image.getWidth(null);
//        int height=image.getHeight(null);
//        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
//        Graphics2D g2=newImage.createGraphics();
//        double angle = M(180);
//        double sin = Math.sin(angle);
//        double cos = Math.cos(angle);
//        double x0 = 0.5*(width-1); //titik rotate image
//        double y0 = 0.5*(height-1); //Pertengahan image
//        g2.rotate(angle,x0,y0);
//        g2.drawImage(image,null,0,0);
//        
        return newImage;
    }

public static void main(String[] args){
    try{
        BufferedImage Image=ImageIO.read(new File ("C:\\Users\\Dama Putra\\Pictures\\ImageProcessing\\sky.jpg"));
        BufferedImage subImage=rotate(Image);
        File output= new File("C:\\Users\\Dama Putra\\Pictures\\ImageProcessing\\skyRotate1.jpg");
        System.out.println("Successfully converted a image into a Rotate");
        ImageIO.write(subImage,"jpg",output);
        }
        catch(IOException e){
            System.out.println(e);
        }
    } 
}    
