package dpSolutions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nivedan
 */
public class MaxIncreasingSubSeqSolutionTest {
    
    MaxIncreasingSubSeqSolution objRef;
    
    public MaxIncreasingSubSeqSolutionTest() {
        
        objRef = new MaxIncreasingSubSeqSolution();
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testSolution1() {
         int input[] = {4,2,7,3,5,2,1,6,7,8};
         int output = objRef.MaxIncreasingSubSeq(input);
         int expected = 6;
         assertEquals("Doesn't work for decrease increase decrease array!",expected,output);
     }
         @Test
     public void testSolution2() {
         int input[] = {5,4,3,2,1,-1,2,-1,3,-1,4,-1,5};
         int output = objRef.MaxIncreasingSubSeq(input);
         int expected = 5;
         assertEquals("Doesn't work for alternating -1 signs array!",expected,output);
     }
         @Test
     public void testSolution3() {
         int input[] = {1,1,1,1,1,1,1};
         int output = objRef.MaxIncreasingSubSeq(input);
         int expected = 1;
         assertEquals("Doesn't work for all same digits array!",expected,output);
     }
         @Test
     public void testSolution4() {
         int input[] = {4,2,7};
         int output = objRef.MaxIncreasingSubSeq(input);
         int expected = 2;
         assertEquals("Doesn't work for size 3 array!",expected,output);
     }
         @Test
     public void testSolution5() {
         int input[] = {};
         int output = objRef.MaxIncreasingSubSeq(input);
         int expected = 0;
         assertEquals("Doesn't work for size 0 array!",expected,output);
     }
}
