public class Remove_element {
    public static void main(String[] args) {
        int [] nums = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};
        int k = removeElement(nums, 3);
        System.out.println(k);
    }
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
