/*

Find Minimum in Rotated Sorted Array

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).Find the minimum element.

The array may contain duplicates.

Example:

Input: [1,3,5]
Output: 1

*/

class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1, mid;
        while(start <= end){
            mid = (start + end)/2;
            // if(mid == 0) return nums[mid];
            if(mid > 0 && nums[mid] < nums[mid-1]){
               return nums[mid];
            } 
            if(nums[mid] < nums[end]) end = mid;
            else if(nums[mid] > nums[end]) start = mid + 1;
            else end -= 1;  //when mid element and end element are equal... not required if numbers arent repeated
        }
        return nums[0];
    }
}