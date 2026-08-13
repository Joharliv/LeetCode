class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i : nums) {
            int val = k - i;
            if (map.containsKey(val)) {
                count++;
                if (map.get(val) > 1) {
                    map.put(val, map.get(val) - 1);
                } else {
                    map.remove(val);
                }
            } else {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        return count;
    }
}