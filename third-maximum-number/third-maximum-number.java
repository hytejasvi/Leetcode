class Solution {
    public int thirdMax(int[] nums) {
       // Initialize three variables to store the maximums
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer num : nums) {
            // Skip the number if it's already one of the top three maximums
            if (num.equals(firstMax) || num.equals(secondMax) || num.equals(thirdMax)) continue;
            
            // Update the three maximums accordingly
            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }
        
        // If thirdMax was never set, return firstMax (the largest number)
        return thirdMax == null ? firstMax : thirdMax;
    }
}