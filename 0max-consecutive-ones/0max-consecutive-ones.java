class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutive = 0;
        int maxconsecutive = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == 1) {
                consecutive += 1;
                if (consecutive > maxconsecutive) {
                    maxconsecutive = consecutive;
                }
            } else {
                consecutive = 0;
            }
        }
        return maxconsecutive;
    }
}