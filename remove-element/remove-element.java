class Solution {
    public int removeElement(int[] nums, int val) {
        int left =0;
        int right =nums.length-1;
        System.out.println("before while: left: "+left+"  right: "+right);
        while (left < right) {
            if (nums[right] == val) {
                right --;
            } else if (nums[left] == val) {
                int k= nums[left];
                nums[left++] = nums[right];
                nums[right--] = k;
            } else {
                left++;
            }
        }
        if (left == right) {
           if (nums[left] == val) {
               left --;
           }
        } else if (right < left) {
            left--;
        }
        return left+1;
    }
}