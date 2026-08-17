class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
    for(int j = 0; j < i; j++) { 

        int Sum = nums[i] + nums[j];
        
        if (Sum == target) {
            return new int[]{i, j};
        }
    }
 }return new int[]{-1, -1};}}