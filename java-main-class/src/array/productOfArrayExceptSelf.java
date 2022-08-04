package array;
/*
* Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

* */
public class productOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums){

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        // calculate the left array
        for(int i = 0; i < left.length; i++){
            if(i == 0){
                left[i] = 1;
            }
            else{
                left[i] = left[i-1]*nums[i-1];
            }
        }
        // calculate the right array
        for(int i = right.length - 1; i >= 0; i--){
            if(i == right.length -1){
                right[i] = 1;
            }
            else{
                right[i] = right[i+1]*nums[i+1];
            }
        }
        int[] answer = new int[nums.length];

        // calculate the answer array
        for(int i = 0; i < answer.length; i++){
            answer[i] = left[i]*right[i];
        }
        return answer;
    }
}
