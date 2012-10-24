
package ludo;

import java.util.Random;

public class die {
   
   int r ;  
   
    
    public die(int r) {
        this.r = r;
    }

   public void die(){
    
   Random rn = new Random();
   r = rn.nextInt(6)+1;
   

   }
   int getdie(){
   return r;
  }
   
     
   
}