class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n+n];
        for(int i=0;i<n+n;i++){
            arr[i]=nums[i%n];
        }
        return arr;
    }
}