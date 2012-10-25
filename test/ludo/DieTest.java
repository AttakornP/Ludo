/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ludo;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author cartoonmed
 */
public class DieTest {
    
    @Test
    public void testRoll_die_more_0() {
        System.out.println("Roll_die_more_0");
        Die instance = new Die();
        int expResult = 0;
        int result = instance.roll_die();
        assertTrue(result > 0 );
    }
    
    @Test
    public void testRoll_die_less_7() {
        System.out.println("Roll_die_less_7");
        Die instance = new Die();
        int expResult = 0;
        int result = instance.roll_die();
        assertTrue(result < 7 );
    }
    
    @Test
    public void testRoll_die_more_6() {
        System.out.println("Roll_die_more_6");
        Die instance = new Die();
        int expResult = 0;
        int result = instance.roll_die();
        assertFalse(result < 1 );
    }
    
    @Test
    public void testRoll_die_less_1() {
        System.out.println("Roll_die_less_1");
        Die instance = new Die();
        int expResult = 0;
        int result = instance.roll_die();
        assertFalse(result > 6 );
    }
}
