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
public class EditDistanceSolution {
    
    public int getEditDistance(String input1, String input2){
        
        int n = input1.length();
        int m = input2.length();
        
        
        if(n==0 && m==0)
            return 0;
        else if (n==0)
            return m;
        else if(m==0)
            return n;

        int opt[][] = new int[n+1][m+1];
        
        int cost=0;
        int mismatch_cost = 1, dash_cost = 1;
        
        for(int i=0;i<n+1;i++)
            opt[i][0] = dash_cost * i;
        
        
        for(int j=0;j<m+1;j++)
            opt[0][j] = dash_cost * j;
            
        
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                
                if(input1.charAt(i-1) == input2.charAt(j-1))
                    cost = 0;
                else
                    cost = mismatch_cost;
                
                opt[i][j] = min(cost + opt[i-1][j-1], 
                                dash_cost + opt[i-1][j],
                                dash_cost + opt[i][j-1]);
            
            }
        }

        return opt[n][m];
    }

    public int min(int a, int b, int c) {
        return (a < b ? (a < c ? a : c) : (b < c ? b : c));
    }
    
}
