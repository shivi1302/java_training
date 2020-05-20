/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author DELL
 */
public class Operations {
    public static void openInternalFrame(JDesktopPane deskpane,JInternalFrame jif){
        deskpane.add(jif);
        jif.setVisible(true);
    }
    public static void setApplicationIcon(JFrame frm){
        try{
            ImageIcon image=new ImageIcon(frm.getClass().getResource("/Icons/icon.png"));
            frm.setIconImage(image.getImage());
        }catch(Exception ex){
            Errorhandler.showErrorStack(ex);
        }
    }
}
