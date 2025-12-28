class Solution {
    public int[] twoSum(int[] arr, int t) {
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(hm.containsKey(t - arr[i])){
                return new int[]{hm.get(t - arr[i]), i};
            }
            hm.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
}