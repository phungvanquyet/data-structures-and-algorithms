package algorithms;

public class SortedSquares {
	public static void main(String[] args) {
        sortedSquares(new int[]{-4 ,-1, 3, 5, 6, 8});

    }


    public static int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length -1;
        for (int n = nums.length -1; n >= 0; n --) {
            if(Math.abs(nums[i]) < Math.abs(nums[j])) {
                nums[n] = nums[j]*nums[j];
                j --;
            } else {
                nums[n] = nums[i]*nums[i];
                i++;
            }
        }
        return nums;
    }
}

/**
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 

Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
*/