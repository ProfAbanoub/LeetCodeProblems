class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        List<List<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                
                if (i > 0 && j > i + 1 && nums[i] == nums[i-1] && nums[j] == nums[j-1]) continue;
                
                int l = j + 1;
                int r = nums.length-1;
                
                while(l < r) {
                    
                    int mySum = (nums[i] + nums[j] + nums[l] + nums[r]); 
                    
                    if ((nums[i] > 0 && nums[j] > 0 && nums[l] > 0 && nums[r] > 0) && mySum < 0 ) break; 
                    
                    if (mySum > target) r--;
                    
                    else if (mySum < target) l++;
                    
                    else {
                        if (list.contains(Arrays.asList(nums[i] , nums[j] , nums[l] , nums[r])) == false)
                        list.add(Arrays.asList(nums[i] , nums[j] , nums[l] , nums[r]));
                        
                        while(l < r && nums[l] == nums[l+1]) l++;
                        while(l < r && nums[r] == nums[r-1]) r--; 
                        l++;
                        r--;
                    }
                }
            }
        }
        return list;
    }
}