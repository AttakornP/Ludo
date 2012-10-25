
package ludo;

import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Die {
   
   public int roll_die(){
    
   Random rn = new Random();
   int r = rn.nextInt(6)+1;
   
   return r;
   } 
   
   public Icon show_point(int point){
       Icon pic_point = null; 
       switch (point){
            case 1 : pic_point = new ImageIcon("../Ludo/img/1.jpg");
               break;
            case 2 : pic_point = new ImageIcon("../Ludo/img/2.jpg");
               break;
            case 3 : pic_point = new ImageIcon("../Ludo/img/3.jpg");
               break;
            case 4 : pic_point = new ImageIcon("../Ludo/img/4.jpg");
               break;
            case 5 : pic_point = new ImageIcon("../Ludo/img/5.jpg");
               break;
            case 6 : pic_point = new ImageIcon("../Ludo/img/6.jpg");
               break;
       }   
       return pic_point;
   }
}