/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpSolutions;

/**
 *
 * @author Nivedan
 */
public class MaxSubArraySumSolution {
    
    public int max(int a, int b){
        
        if(a > b)
            return a;
        else
            return b;
    
    }
    
    public int[] maxSubArraySum(int b[]){
        
        int a[]={};
        int n = b.length;
        //Return empry array if empty array is the input
        if(n == 0)
            return a;
        
        int[] optArray = new int[n];

        optArray[0] = b[0];
        int maxOpt = optArray[0];
        int maxOptIndex = 0;
        
        for(int i=1;i<n;i++){
            
            optArray[i] = max(b[i] + optArray[i-1],b[i]);
            
            if(maxOpt < optArray[i]){
                maxOpt = optArray[i]; 
                maxOptIndex=i;
            }
         
        }
        
        //After finding the optimum or Max sum of sub array backtrack and
        //store the subarray
        
        //Backtracking and finding length of optimum solution
        int backTracker = optArray[maxOptIndex];
        int k;
        for( k= maxOptIndex;k >= 0 && backTracker != 0 ;k--){
            backTracker -= b[k];
        }

        //Preparing to store the sub array
         int firstIndexOpt = k;
        a = new int[maxOptIndex-firstIndexOpt];
        
        
        //Storing the sub array
        int i=0;
        for(k=firstIndexOpt + 1; k<=maxOptIndex; k++){
            a[i++] = b[k];
        }
        
        return a;
    }
    
    
    
}
