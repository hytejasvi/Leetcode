class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Mark elements as visited by negating the value at the corresponding index
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Collect the indices of the elements that remain positive
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missingNumbers.add(i + 1);
            }
        }

        return missingNumbers;
    }
}