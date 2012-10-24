/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ludo;

import java.awt.Dimension;
import javax.swing.text.Position;

/**
 *
 * @author cartoonmed
 */
public class Move {
    
    public int positionX;
    public int positionY;
    
    
    
    public int nextPosition(int current_table, int point_die){
        int nexp_table = current_table + point_die;
        return current_table;  
    }
    
}
