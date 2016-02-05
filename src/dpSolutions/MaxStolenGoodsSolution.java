/**There are n houses built in a line, each of which contains some value in it. 
 * A thief is going to steal the maximal value in these houses, but he cannot steal in 
 * two adjacent houses because the owner of a stolen house will tell his two neighbors on 
 * the left and right side. What is the maximal stolen value?
 *
 *For example, if there are four houses with values {6, 1, 2, 7}, 
 *the maximal stolen value is 13 when the first and fourth houses are stolen.
 */

package dpSolutions;

/**
 *
 * @author Nivedan
 */
public class MaxStolenGoodsSolution {

    int getMaxValueStolenGoods(int [] input) {
        int n = input.length;
        
        if(n == 0)
            return 0;
        
        int maxValue = 0;
        
        boolean isPrevPartOfSolution = false;
        
        int a=0, b=0,c=0;
        
        for(int i=0;i<n;i++){
            
            a = i+1<n ? input[i+1] : Integer.MIN_VALUE ; //-ve Infinity of sorts
            b = i-1>0 ? input[i-1] : Integer.MIN_VALUE ; //-ve Infinity of sorts
            c = input[i];
            
            if(c == max(a,b,c) && !isPrevPartOfSolution){
                maxValue += c; 
                isPrevPartOfSolution=true;
            }else{
                isPrevPartOfSolution = false;
            }
            
        }
        
        return maxValue;
    }
    
    public int max(int a, int b,int c){
    
        return (a>b ? (a>c ? a : c ) : (b>c ? b : c));
    }
    
}
