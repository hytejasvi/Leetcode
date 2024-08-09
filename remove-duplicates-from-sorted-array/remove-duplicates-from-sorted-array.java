class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0,right=1;
        while (right <= nums.length-1) {
            if (nums[left] < nums[right]) {
                nums[left+1] = nums[right];
                left++;
            }
            right++;
        }
        return left+1;
    }
}