/*
    -->     Difference Between Element Sum and Digit Sum of an Array  <--

    You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.

 

Example 1:

Input: nums = [1,15,6,3]
Output: 9
Explanation: 
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
Example 2:

Input: nums = [1,2,3,4]
Output: 0
Explanation:
The element sum of nums is 1 + 2 + 3 + 4 = 10.
The digit sum of nums is 1 + 2 + 3 + 4 = 10.
The absolute difference between the element sum and digit sum is |10 - 10| = 0.
 

Constraints:

1 <= nums.length <= 2000
1 <= nums[i] <= 2000
 */

public class Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 9) {
                int sum = digitSum(nums[i]);
                digit_sum += sum;
            } else {
                digit_sum += nums[i];
            }

            element_sum += nums[i];

        }
        System.out.println(element_sum);
        System.out.println(digit_sum);

        return Math.abs(element_sum - digit_sum);

    }

    public int digitSum(int n) {
        int sum = 0;
        while (n != 0) {

            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
}
