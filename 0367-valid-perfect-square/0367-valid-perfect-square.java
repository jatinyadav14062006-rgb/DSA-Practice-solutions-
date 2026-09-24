class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        int firstTrueIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid >= num) {
                firstTrueIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return firstTrueIndex != -1 && (long) firstTrueIndex * firstTrueIndex == num;
    }
}