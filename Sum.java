class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int n=nums.length;
        int f[]=new int[101];
        for(int i=0;i<n;i++){
            f[nums[i]]++;
        }
        int t=0;
        for(int i=1;i<=100;i++){
            if(f[i]%k==0)
                t=t+i*f[i];
        }
        return t;
    }
}
