
class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);

        return new int[]{first, last};
    }

    private int findPosition(int[] nums,
                             int target,
                             boolean firstOccurrence) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;

            } else if (nums[mid] > target) {
                end = mid - 1;

            } else {

                ans = mid;

                if (firstOccurrence) {
                    end = mid - 1;     // move left
                } else {
                    start = mid + 1;   // move right
                }
            }
        }

        return ans;
    }
}
