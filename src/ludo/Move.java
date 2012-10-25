/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ludo;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.text.Position;

/**
 *
 * @author cartoonmed
 */
public class Move {
    
    
    
    public int nextPosition(int current_table, int point_die){
        int nexp_table = current_table + point_die;
        if(nexp_table < 40){
            return nexp_table;  
        }
        else{
            return current_table;
        }
    }
    
    public Icon show_status(int round){
        
        Icon colour = null;
        if(round % 4 == 1){
            colour = new ImageIcon("../Ludo/img/1.jpg");
        }
        else if(round % 4 == 2){
            colour = new ImageIcon("../Ludo/img/1.jpg");
        }
        else if(round % 4 == 3){
            colour = new ImageIcon("../Ludo/img/1.jpg");
        }
        else if(round % 4 == 0){
            colour = new ImageIcon("../Ludo/img/1.jpg");
        }
        return colour;
        
    }
    
}
