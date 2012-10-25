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
public class MoveTest {
    

    @Test
    public void testNextPosition_1() {
        System.out.println("nextPosition");
        int current_table = 0;
        int point_die = 6;
        Move instance = new Move();
        int expResult = 6;
        int result = instance.nextPosition(current_table, point_die);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testNextPosition_2() {
        System.out.println("nextPosition");
        int current_table = 10;
        int point_die = 3;
        Move instance = new Move();
        int expResult = 13;
        int result = instance.nextPosition(current_table, point_die);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testNextPosition_3() {
        System.out.println("nextPosition");
        int current_table = 23;
        int point_die = 5;
        Move instance = new Move();
        int expResult = 28;
        int result = instance.nextPosition(current_table, point_die);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testNextPosition_4() {
        System.out.println("nextPosition");
        int current_table = 34;
        int point_die = 6;
        Move instance = new Move();
        int expResult = 34;
        int result = instance.nextPosition(current_table, point_die);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testNextPosition_5() {
        System.out.println("nextPosition");
        int current_table = 38;
        int point_die = 6;
        Move instance = new Move();
        int expResult = 38;
        int result = instance.nextPosition(current_table, point_die);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testNextPosition_6() {
        System.out.println("nextPosition");
        int current_table = 30;
        Move instance = new Move();
        Die roll = new Die();
        int point_die = roll.roll_die();
        int result = instance.nextPosition(current_table, point_die);
        assertTrue(result>30);

    }
    
    @Test
    public void testNextPosition_7() {
        System.out.println("nextPosition");
        int current_table = 30;
        Move instance = new Move();
        Die roll = new Die();
        int point_die = roll.roll_die();
        int result = instance.nextPosition(current_table, point_die);
        assertTrue(result<37);

    }
}
