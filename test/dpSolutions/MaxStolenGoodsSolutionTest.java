/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpSolutions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nivedan
 */
public class MaxStolenGoodsSolutionTest {
    MaxStolenGoodsSolution objRef;
    public MaxStolenGoodsSolutionTest() {
        objRef = new MaxStolenGoodsSolution();
    }

    @Test
    public void testSolution1() {
        int input[] = {6,1,2,7};
        int output = objRef.getMaxValueStolenGoods(input);
        int expected = 13;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution2() {
        int input[] = {16,1,8,10,2,7};
        int output = objRef.getMaxValueStolenGoods(input);
        int expected = 33;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution3() {
        int input[] = {16,16,16,16,16};
        int output = objRef.getMaxValueStolenGoods(input);
        int expected = 16*3;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution4() {
        int input[] = {16};
        int output = objRef.getMaxValueStolenGoods(input);
        int expected = 16;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution5() {
        int input[] = {};
        int output = objRef.getMaxValueStolenGoods(input);
        int expected = 0;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution6() {
        int input[] = {2,5};
        int output = objRef.getMaxValueStolenGoods(input);
        int expected = 5;
        assertEquals("Test Failed!",expected,output);
    }
    
}
