
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length; //3..
        int[] ans = new int[n];

    for (int i = 0; i < n; i++) {
            ans[i] = -1;
            for (int j = 1; j < n; j++) {
                int idn = (i + j) % n; //ca
                if (nums[idn] > nums[i]) {
                    ans[i] = nums[idn];
                    break;
                }
            }  }
   return ans;
    }}
