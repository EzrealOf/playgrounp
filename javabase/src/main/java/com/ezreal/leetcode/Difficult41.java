package com.ezreal.leetcode;

import java.util.Arrays;

/**
 * 给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,0]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 示例 3:
 * <p>
 * 输入: [7,8,9,11,12]
 * 输出: 1
 *  
 * <p>
 * 提示：
 * <p>
 * 你的算法的时间复杂度应为O(n)，并且只能使用常数级别的额外空间。
 * <p>
 * 通过次数103,984提交次数257,755
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/first-missing-positive
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author ezeal
 */
public class Difficult41 {
    public static void main(String[] args) {

    }

    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int result = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            int k = nums[i];
            if (k <= 0){
                break;
            }



        }
        return result;
    }
}
