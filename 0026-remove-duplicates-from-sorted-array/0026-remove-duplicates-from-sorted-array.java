class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueIndex = 0;
        for( int currentElement : nums){
            if(uniqueIndex ==0 || currentElement != nums[uniqueIndex-1]){
                nums[uniqueIndex] = currentElement;
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
}