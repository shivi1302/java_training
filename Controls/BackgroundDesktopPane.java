/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controls;

import Utility.Errorhandler;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author DELL
 */
public class BackgroundDesktopPane extends JDesktopPane{
    private Image backimage;

    public BackgroundDesktopPane() {
       try{
            ImageIcon image=new ImageIcon(getClass().getResource("/Icons/background.jpg"));
            this.backimage= image.getImage();
        }catch(Exception ex){
            Errorhandler.showErrorStack(ex);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if(backimage!=null){
            g.drawImage(backimage,0, 0,getWidth(),getHeight(), this);
        }else{
            super.paintComponent(g);
        }
    }
    
        
}
