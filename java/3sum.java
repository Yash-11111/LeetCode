// ======================================
// LeetCode Problem: 3sum
// Language: java
// Link: https://leetcode.com/problems/3sum/
// Synced by: LinkCode
// Date: 8/31/2026, 9:27:56 PM
// ======================================


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> al = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i>0 && nums[i]==nums[i-1] )
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                 List<Integer> zz = new ArrayList<>();
                    zz.add(nums[i]);
                    zz.add(nums[j]);
                    zz.add(nums[k]);
                    al.add(zz);
                    j++;
                    k--;
                    while (j<k && nums[j] == nums[j - 1])
                        j++;
                    while (j<k &&  nums[k] == nums[k + 1])
                        k--;
                }

            }
        }
        return al;
    }
}