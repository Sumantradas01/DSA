class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;  // Length of the input array
        int currSum = nums[0];  // Initialize current subarray sum with the first element
        int maxSum = nums[0];   // Initialize the maximum subarray sum with the first element
      
       // Iterate through the array starting from the second element
       for (int i = 1; i < n; i++) {
           // Update currSum by either adding the current element to the subarray or starting a new subarray
           currSum = Math.max(currSum + nums[i], nums[i]);
           // Update maxSum with the larger of maxSum and currSum
           maxSum = Math.max(maxSum, currSum);
       }
       return maxSum;  // Return the maximum subarray sum found
    }
}