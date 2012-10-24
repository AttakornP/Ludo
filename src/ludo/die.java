
package ludo;

import java.util.Random;

public class die {
   
   public int roll_die(){
    
   Random rn = new Random();
   int r = rn.nextInt(6)+1;
   
   return r;
   } 
}