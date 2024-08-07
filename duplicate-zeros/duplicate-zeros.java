class Solution {
    public void duplicateZeros(int[] arr) {
        int i=0;
        while(i<arr.length) {
            if (arr[i] !=0) {
                i++;
            } else if (arr[i] ==0) {
                int k=i+1;
                for (int x = arr.length-1; x > k ; x--) {
                    arr[x] = arr[x-1];
                }
                if (k < arr.length) {
                    arr[k] = arr[i];
                }
                i+=2;
            }
        }
    }
}