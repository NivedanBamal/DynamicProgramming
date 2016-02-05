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
public class CoinChangeSolutionTest {
    CoinChangeSolution objRef;
    public CoinChangeSolutionTest() {
        objRef = new CoinChangeSolution();
    }

    @Test
    public void testSolution1() {
        int coinTypes[] = {1,5,2};
        int val = 7;
        int output = objRef.getMinCoinsNeededForChange(coinTypes, val);
        int expected = 2;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution2() {
        int coinTypes[] = {5,2};
        int val = 10000;
        int output = objRef.getMinCoinsNeededForChange(coinTypes, val);
        int expected = 2000;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution3() {
        int coinTypes[] = {1,5,2};
        int val = 0;
        int output = objRef.getMinCoinsNeededForChange(coinTypes, val);
        int expected = 0;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution4() {
        int coinTypes[] = {};
        int val = 80;
        int output = objRef.getMinCoinsNeededForChange(coinTypes, val);
        int expected = 0;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution5() {
        int coinTypes[] = {};
        int val = 0;
        int output = objRef.getMinCoinsNeededForChange(coinTypes, val);
        int expected = 0;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution6() {
        int coinTypes[] = {10};
        int val = 70;
        int output = objRef.getMinCoinsNeededForChange(coinTypes, val);
        int expected = 7;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution7() {
        int coinTypes[] = {1,9,2,3,4};
        int val = 9;
        int output = objRef.getMinCoinsNeededForChange(coinTypes, val);
        int expected = 1;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution8() {
        int coinTypes[] = {1,9,2,3,4};
        int val = 17;
        int output = objRef.getMinCoinsNeededForChange(coinTypes, val);
        int expected = 3;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution9() {
        int coinTypes[] = {1,5,2};
        int val = 93;
        int output = objRef.getMinCoinsNeededForChange(coinTypes, val);
        int expected = 20;
        assertEquals("Test Failed!",expected,output);
    }

    
    
}
