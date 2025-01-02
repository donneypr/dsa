class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++){
                if (i != j && nums[i] + nums[j] == target){
                    return new int[] {i,j};
                } 
            }
        }
        return new int[0];
    }
}

//o(n)^2 time complexity = not ideal as it needs to iterate through the array for each index in the array. 