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
            colour = new ImageIcon("../Ludo/img/statusRed1.png");
        }
        else if(round % 4 == 2){
            colour = new ImageIcon("../Ludo/img/statusGreen1.png");
        }
        else if(round % 4 == 3){
            colour = new ImageIcon("../Ludo/img/statusYellow1.png");
        }
        else if(round % 4 == 0){
            colour = new ImageIcon("../Ludo/img/statusBlue1.png");
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
    
    public boolean move_over(int nextPoX, int nextPoY, int currentPX, int currentPoY){
        boolean over = false;
        if(nextPoX == currentPX && nextPoY == currentPoY){
            over = true;
        }        
        return over;
    }
    
    public void back_to_home(Player P1, Player P2, Player P3, Player P4){
        if(P1.getPoX_current() == P2.getPoY_current() && 
           P1.getPoX_current() == P2.getPoY_current()){
            P2.setPoX_current(P2.getPoX_start());
            P2.setPoY_current(P2.getPoY_start());
        }
        else if(P1.getPoX_current() == P3.getPoY_current() && 
           P1.getPoX_current() == P3.getPoY_current()){
            P3.setPoX_current(P3.getPoX_start());
            P3.setPoY_current(P3.getPoY_start());
        }
        else if(P1.getPoX_current() == P4.getPoY_current() && 
           P1.getPoX_current() == P4.getPoY_current()){
            P4.setPoX_current(P4.getPoX_start());
            P4.setPoY_current(P4.getPoY_start());
        }
        
    }
    
}
