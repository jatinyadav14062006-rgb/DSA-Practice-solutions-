class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        for (int index = num.length - 1; index >= 0 || k > 0; index--) {
            if (index >= 0) {
                k += num[index];
            }
            result.add(k % 10);
            k /= 10;
        }
        Collections.reverse(result);
        return result;
    }
}
