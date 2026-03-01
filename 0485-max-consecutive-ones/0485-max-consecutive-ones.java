class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int j = -1;
        int n = arr.length;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                max = Math.max(max, i - j - 1);
                j = i;
            }
        }
        return Math.max(max, n - j - 1);
    }
}