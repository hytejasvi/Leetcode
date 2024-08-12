class Solution {
    public int heightChecker(int[] heights) {
        int []arr = new int[heights.length];
        for (int i=0;i<heights.length;i++) {
            arr[i] = heights[i];
        }
        for (int i=0;i<heights.length-1;i++) {
            for (int j=0;j<heights.length-1;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int count =0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}