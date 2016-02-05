/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpSolutions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nivedan
 */
public class MaxSubArraySumSolutionTest {
    
    MaxSubArraySumSolution objRef ;
    
    public MaxSubArraySumSolutionTest() {
        objRef = new MaxSubArraySumSolution();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }
    

     @Test
     public void testSoultion0() {
         
         int input[] = {1, -2, 3, 10, -4, 7, 2,  -5};
         int output[] = objRef.maxSubArraySum(input);
         int expected[] = {3,10,-4,7,2};
         assertArrayEquals("Unexpected result!", expected, output);
     }
     
     @Test
     public void testSoultion1() {
         
         int input[] = {1, -2, 3, 10, -4, 7, 2,  -5,99};
         int output[] = objRef.maxSubArraySum(input);
         int expected[] = {3,10,-4,7,2,-5,99};
         assertArrayEquals("Unexpected result!", expected, output);
     }
     
     @Test
     public void testSoultion2() {
         
         int input[] = {1, -2, 3, 10, -4,-99, 7, 2,  -5};
         int output[] = objRef.maxSubArraySum(input);
         int expected[] = {3,10};
         assertArrayEquals("Unexpected result!", expected, output);
     }
     
     @Test
     public void testSoultion3() {
         
         int input[] = {100, 2, 3, 10, -4, 7, 2,  -5};
         int output[] = objRef.maxSubArraySum(input);
         int expected[] = {100, 2, 3, 10, -4, 7, 2,};
         assertArrayEquals("Unexpected result!", expected, output);
     }
     
     @Test
     public void testSoultion4() {
         
         int input[] = {1, -2, 3, 10, -26, 4, 9,  -5};
         int output[] = objRef.maxSubArraySum(input);
         int expected[] = {3,10};
         assertArrayEquals("Unexpected result!", expected, output);
     }
     
     @Test
     public void testSoultion5() {
         
         int input[] = {1, -2};
         int output[] = objRef.maxSubArraySum(input);
         int expected[] = {1};
         assertArrayEquals("Unexpected result!", expected, output);
     }
     
     @Test
     public void testSoultion6() {
         
         int input[] = {-10,1,-100};
         int output[] = objRef.maxSubArraySum(input);
         int expected[] = {1};
         assertArrayEquals("Unexpected result!", expected, output);
     }
     
     @Test
     public void testSoultion7() {
         
         int input[] = {};
         int output[] = objRef.maxSubArraySum(input);
         int expected[] = {};
         assertArrayEquals("Unexpected result!", expected, output);
     }
     
     @Test
     public void testSoultion8() {
         
         int input[] = {};
         int output[] = objRef.maxSubArraySum(input);
         int expected[] = {};
         assertArrayEquals("Unexpected result!", expected, output);
     }
     
          @Test
     public void testSoultion9() {
         
         int input[] = {-1,-1,-1,-1,-1};
         int output[] = objRef.maxSubArraySum(input);
         int expected[] = {-1};
         assertArrayEquals("Unexpected result!", expected, output);
     }
     
     
}

