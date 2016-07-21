public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length<3) return result;
        Arrays.sort(nums);
        if(nums[0]==nums[nums.length-1] && nums[0]==0) result.add(Arrays.asList(nums[0],nums[1],nums[2]));
        else if(nums[0]<0 && nums[nums.length-1]<=0) return result;
        else{
            for(int i=0;i<nums.length-2;i++){
                if(i!=0 && nums[i]==nums[i-1]) continue;
                for(int j=i+1;j<nums.length-1;j++){
                    if(j!=i+1 && nums[j]==nums[j-1]) continue;
                    for(int k=nums.length-1;k>j;k--){
                        if(nums[k]<0) break;
                        else if(k!=nums.length-1 && nums[k]==nums[k+1]) continue;
                        else{
                            if(nums[i]+nums[j]+nums[k]==0) result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        }
                    }
                }
            }
        }
        return result;
    }
}
