class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--) {
            if (max <= arr[i]) {
                int temp = arr[i];
                arr[i] =  max;
                max = temp;
            } else {
                arr[i] = max;
            }            
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}