class Solution {
    public int[] constructTransformedArray(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                res[i] = arr[(n + (i + arr[i]) % n) % n];
            }else if(arr[i] > 0){
                
                res[i] = arr[(arr[i] + i) % n];
            }else{
                res[i] = arr[i];
            }
        }
        return res;
    }
}