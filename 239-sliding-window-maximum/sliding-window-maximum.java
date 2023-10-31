class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      
        int len = nums.length;
        if (len <= k) {
            return new int[] { getMaxVal(nums) };
        }

        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[len - k + 1];

        for (int i = 0; i < len; i++) {
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    private int getMaxVal(int[] nums) {
        int max = nums[0];
        for (int n : nums) {
            max = Math.max(max, n);
        }
        return max;
    }
}