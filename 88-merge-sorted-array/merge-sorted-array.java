class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        Stack<Integer> output = new Stack<>();

        for (int i = 0; i < m; i++) {
            output.push(nums1[i]);
        }

        for (int j = 0; j < n; j++) {
            output.push(nums2[j]);
        }

        output.sort(null);

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = output.get(i);
        }
    }
}