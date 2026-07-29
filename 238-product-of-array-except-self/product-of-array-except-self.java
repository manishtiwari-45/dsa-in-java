class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] suff = new int[n];
        int[] pre = new int[n];

        for(int i=0; i<n; i++){
            pre[i] = 1;
            suff[i] = 1;
        }
        
        
        for(int i = 1; i<n;i++){
            pre[i] = nums[i-1]*pre[i-1];
        }
        for(int i=n-2; i>=0; i--) {
            suff[i] = nums[i+1]*suff[i+1];
        }
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            ans[i] = suff[i]*pre[i];
        }

        return ans;
    }
}