public class RichestCustomerWealth {

    class Solution {
        public int maximumWealth(int[][] accounts) {
            int max = 0;
            int newMax = 0;
            for (int i = 0; i < accounts.length; i ++) {
                newMax = 0;
                for (int j = 0; j< accounts[i].length; j ++) { 
                    newMax += accounts[i][j];
                    if (newMax >= max) { 
                    max = newMax;
                } 
                }
            }
            return max;
        }
    }
    
}
