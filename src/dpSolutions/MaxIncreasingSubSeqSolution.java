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
public class MaxIncreasingSubSeqSolution {
    
    public int MaxIncreasingSubSeq(int input[]){
        
        int n = input.length;
        if(n == 0)
            return 0;
        
        int optArray[] = new int[n];
        
        optArray[0] = 1;
        
        int max = 0;
        
        for(int i=1;i<n;i++){
            
            max = 0;
            
            for(int z=0;z<i;z++){
            
                if(input[z] < input[i] && optArray[z] > max){
                    max = optArray[z];
                }
            
            }
            
            optArray[i] = max + 1;
        
        }
        
        
        max = optArray[0];
        for(int i=1;i<n;i++){
            if(max < optArray[i])
                max = optArray[i];
        
        }
        
        
        return max;
    
    }
    
    
}
