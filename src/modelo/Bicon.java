/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import becker.robots.icons.Icon;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Flexxo333
 */
public class Bicon extends Icon{
    
   private String icono;
   
   public Bicon(String icono) {
    this.icono = icono;
   }
    
  public void paintIcon(Graphics g)
  {
    try
    {
      BufferedImage bi = ImageIO.read(new File(this.icono));
      //g.drawImage(cat, dx1,dy1, dx2,dy2, sx1, sy1 , sx2 ,sy2, this)***********
      g.drawImage(bi, 20, 30, 84, 78, 0, 0, 32, 32, null);
      //Al escoger otro segmento del .PNG,  el sembrador desaparece 
      //g.drawImage(bi, 20, 30, 84, 78, 160, 0, 192, 32, null);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
    
}
