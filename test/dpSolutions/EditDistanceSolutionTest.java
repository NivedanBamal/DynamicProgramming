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
public class EditDistanceSolutionTest {
    
    EditDistanceSolution objRef;
    
    public EditDistanceSolutionTest() {
        objRef = new EditDistanceSolution();
    }

    @Test
    public void testSolution1() {
        String input1 = "namt";
        String input2 = "name";
        int output = objRef.getEditDistance(input1, input2);
        int expected = 1;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution2() {
        String input1 = "mean";
        String input2 = "name";
        int output = objRef.getEditDistance(input1, input2);
        int expected = 4;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution3() {
        String input1 = "meaning";
        String input2 = "mean";
        int output = objRef.getEditDistance(input1, input2);
        int expected = 3;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution4() {
        String input1 = "mean";
        String input2 = "namesake";
        int output = objRef.getEditDistance(input1, input2);
        int expected = 5;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution5() {
        String input1 = "";
        String input2 = "namesake";
        int output = objRef.getEditDistance(input1, input2);
        int expected = 8;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution6() {
        String input1 = "namesake";
        String input2 = "";
        int output = objRef.getEditDistance(input1, input2);
        int expected = 8;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution7() {
        String input1 = "";
        String input2 = "";
        int output = objRef.getEditDistance(input1, input2);
        int expected = 0;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution8() {
        String input1 = "abcdefg";
        String input2 = "gfedcba";
        int output = objRef.getEditDistance(input1, input2);
        int expected = 6;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution9() {
        String input1 = "a";
        String input2 = "g";
        int output = objRef.getEditDistance(input1, input2);
        int expected = 1;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testSolution0() {
        String input1 = "same";
        String input2 = "same";
        int output = objRef.getEditDistance(input1, input2);
        int expected = 0;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testMinFn0() {
        int a = 0;
        int b = 1;
        int c = 2;
        int output = objRef.min(a,b,c);
        int expected = 0;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testMinFn1() {
        int a = 0;
        int b = 2;
        int c = 1;
        int output = objRef.min(a,b,c);
        int expected = 0;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testMinFn2() {
        int a = 1;
        int b = 0;
        int c = 2;
        int output = objRef.min(a,b,c);
        int expected = 0;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testMinFn3() {
        int a = 2;
        int b = 0;
        int c = 1;
        int output = objRef.min(a,b,c);
        int expected = 0;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testMinFn4() {
        int a = 1;
        int b = 2;
        int c = 0;
        int output = objRef.min(a,b,c);
        int expected = 0;
        assertEquals("Test Failed!",expected,output);
    }
    @Test
    public void testMinFn5() {
        int a = 2;
        int b = 1;
        int c = 0;
        int output = objRef.min(a,b,c);
        int expected = 0;
        assertEquals("Test Failed!",expected,output);
    }
    
    
}
