/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Emre
 */
public class BufferedImageLoader
{
    private BufferedImage image;
    
    
    public BufferedImage loadImage(String path)
    {
        try
        {
            image = ImageIO.read(getClass().getResource(path));
        } catch (IOException ex)
        {
            Logger.getLogger(BufferedImageLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return image;
    }
}
