class Solution {
    public int removeElement(int[] nums, int val) {

        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while (left <= right) {

            while (left <= right && nums[right] == val) {
                right--;
                count++;
            }

            if (left > right) {
                break;
            }

            if (nums[left] == val) {
                count++;

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
            else {
                left++;
            }
        }

        return nums.length - count;
    }
}