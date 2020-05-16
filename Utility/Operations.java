/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import javax.swing.JDesktopPane;
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
}
