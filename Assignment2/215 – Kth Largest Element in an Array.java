class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> Hp = new PriorityQueue<>();
        for (int num : nums) {
            Hp.offer(num);
            if (Hp.size() > k) {
                Hp.poll();
            }
        }
        return Hp.peek();
    }
}
