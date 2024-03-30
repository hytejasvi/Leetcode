public class DuplicateRemoval {
    public static void main(String[] args) {
        int [] nums = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};
        int k = removeDuplicates(nums);
        System.out.println(k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        HashSet<Integer> x = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // We will update the array in place
            nums[count] = nums[i];
            count++;
        }
        return count;
    }

}
