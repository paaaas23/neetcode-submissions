class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        boolean found=false;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int a=entry.getValue();
            System.out.print(a+"->");
            if(a>1){
                found=true;
                return true;
            }
        }
        
    return false;    
    }
}