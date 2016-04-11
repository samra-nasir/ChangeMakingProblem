/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changemakingproblem;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Samra
 */
public class ChangeMakingProblemTest {
    

    /**
     * Test of greedy method, of class ChangeMakingProblem.
     */
    @Test
    public void testGreedy() {
        System.out.println("greedy");
        int amount = 99;
        int count = 0;
        int expResult = 9;
        int result = ChangeMakingProblem.greedy(amount, count);
        assertEquals(expResult, result);
    }

    /**
     * Test of dynamicProgramming method, of class ChangeMakingProblem.
     */
    @Test
    public void testDynamicProgram() {
        System.out.println("dynamicProgramming");
        int[] d = {1,5,10,25};
        int amount = 99;
        int expResult = 9;
        int result = ChangeMakingProblem.dynamicProgram(d, amount);
        assertEquals(expResult, result);
    }

    
}
