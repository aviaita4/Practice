package dp;

public class MaxLengthRepeatedSubArray {

}

class Solution {
    
    int globalAns;
    
    public int findLength(int[] A, int[] B) {
        if(A.length == 0 || B.length == 0){
            return 0;
        }
        
        //helper(A, B, 0, 0, 0);
        //return globalAns;
        
        return helper2(A,B);
    }
    
    public void helper(int[] A, int[] B, int i, int j, int tempAns){
        
        if(i>A.length-1 || j>B.length-1) return;
        
        if(A[i]==B[j]){
            if(tempAns+1 > globalAns) globalAns = tempAns+1;
            helper(A,B,i+1,j+1, tempAns+1);
            
        }
        helper(A,B,i+1,j,0);
        helper(A,B,i,j+1,0);    
        
    }
    
    public int helper2(int[] A, int[] B){
        
        int ans = 0;
        int m = A.length;
        int n = B.length;
        
        int[][] dp = new int[m+1][n+1];
        
        for(int i=m; i>=0; i--){
            dp[i][n] = 0;
        }
        
        for(int j=n; j>=0; j--){
            dp[m][j] = 0;
        }
        
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                int temp = 0;
                if(A[i] != B[j]){
                    dp[i][j] = temp;
                }else{
                    dp[i][j] = Math.max(1+dp[i+1][j+1] , temp);
                }
                
                if(dp[i][j] > ans) ans = dp[i][j];
            }
        }
        
        return ans;
    }
}