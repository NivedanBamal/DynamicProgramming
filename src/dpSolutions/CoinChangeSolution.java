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
public class CoinChangeSolution {
    
    public int getMinCoinsNeededForChange(int a[], int val){

        if(val == 0 || a.length == 0)
            return 0;
        
        int optLen = val + 1;
        int opt[] = new int[optLen];
        
        opt[0] = 0;
        
        int min;
        min = 0;
        
        int interimOpt;
        interimOpt = 0;
        
        for(int i=1;i < optLen;i++){
            
            min = Integer.MAX_VALUE;
            for(int j=0;j < a.length && a[j] <= i;j++){
                
                interimOpt = 1 + opt[i-a[j]];
                if(interimOpt < min)
                    min = interimOpt;
            }
            opt[i] = (min == Integer.MAX_VALUE ? 0 : min);
        }
        
        return opt[optLen-1];
    }
    
}
