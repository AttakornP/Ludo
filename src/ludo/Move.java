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
            colour = new ImageIcon("../Ludo/img/statusRed.png");
        }
        else if(round % 4 == 2){
            colour = new ImageIcon("../Ludo/img/statusGreen.png");
        }
        else if(round % 4 == 3){
            colour = new ImageIcon("../Ludo/img/statusYellow.png");
        }
        else if(round % 4 == 0){
            colour = new ImageIcon("../Ludo/img/statusBlue.png");
        }
        return colour;
        
    }
    
    
    public Icon show_win(int round){
        
        Icon win = null;
        if(round % 4 == 1){
            win = new ImageIcon("../Ludo/img/winner_red.jpg");
        }
        else if(round % 4 == 2){
            win = new ImageIcon("../Ludo/img/winner_green.jpg");
        }
        else if(round % 4 == 3){
            win = new ImageIcon("../Ludo/img/winner_yellow.jpg");
        }
        else if(round % 4 == 0){
            win = new ImageIcon("../Ludo/img/winner_blue.jpg");
        }
        return win;
        
    }
    
}
