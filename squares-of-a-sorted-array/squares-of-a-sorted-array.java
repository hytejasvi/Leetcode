class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] squared = new int[nums.length];
        for (int i=0;i<n;i++) {
            nums[i] = nums[i] * nums[i]; //squaring the elements
        }
        int left = 0;
        int right = n-1;
        int index = n-1;
        while (left <= right) {
            if (nums[left] > nums[right]) {
                squared[index] = nums[left];
                index--;
                left++;
            } else {
                squared[index] = nums[right];
                index --;
                right --;
            }
        }
        return squared;
    }
}