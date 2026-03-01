class Solution {
    public int[] findErrorNums(int[] arr) {
        int n = arr.length;
        int[] res = new int[2];
        long sum = 0;
        long ssum = 0;
        long s = 0;
        long ss = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            ssum += arr[i]*arr[i];
            s += i+1;
            ss += (i + 1) * (i + 1);
        }

        

        long rmm = sum - s;
        long srmm = ssum - ss;

        long rpm = srmm/rmm;
        int r = (int)(rmm + rpm)/2;
        int m = (int)(rpm - r);

        res[0] = r;
        res[1] = m;

        return res;
    }
}