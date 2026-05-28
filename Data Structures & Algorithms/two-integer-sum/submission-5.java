class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            indices.put(nums[i], i);
        }

        for(int i = 0; i<nums.length; i++)
        {
            int diff = target - nums[i];
            if(indices.containsKey(diff) && indices.get(diff) != i){
                return new int[]{i , indices.get(diff)};
            }
        }
        return new int[0];
    }
}


// Two Sum

// Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

// You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

// Return the answer with the smaller index first.

// Example 1:

// Input: 
// nums = [3,4,5,6], target = 7

// Output: [0,1]